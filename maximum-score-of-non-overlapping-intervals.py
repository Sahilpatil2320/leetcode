from bisect import bisect_right

class Solution:
    def maximumWeight(self, intervals):
        n = len(intervals)

        # (start, end, weight, original_index)
        arr = []

        for i, (l, r, w) in enumerate(intervals):
            arr.append((l, r, w, i))

        # Sort by start time
        arr.sort()

        starts = [x[0] for x in arr]

        # dp[i][k] = best result from i onward
        # using at most k intervals
        dp = [[None] * 5 for _ in range(n + 1)]

        # Base case
        for k in range(5):
            dp[n][k] = (0, [])

        def better(a, b):
            # Higher score
            if a[0] != b[0]:
                return a if a[0] > b[0] else b

            # Same score -> lexicographically smaller indices
            return a if a[1] < b[1] else b

        for i in range(n - 1, -1, -1):

            # Choosing 0 intervals
            dp[i][0] = (0, [])

            l, r, weight, index = arr[i]

            # First interval with start > r
            next_i = bisect_right(starts, r)

            for k in range(1, 5):

                # Option 1: Skip current interval
                skip = dp[i + 1][k]

                # Option 2: Take current interval
                next_score, next_indices = dp[next_i][k - 1]

                take_indices = next_indices + [index]
                take_indices.sort()

                take = (
                    weight + next_score,
                    take_indices
                )

                dp[i][k] = better(skip, take)

        return dp[0][4][1]