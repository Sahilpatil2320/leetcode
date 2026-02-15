# 2843. Count Symmetric Integers

class Solution:
    def countSymmetricIntegers(self, low: int, high: int) -> int:
        # for i in range (low,high):
        def is_symmetric(num):
            i = str(num)

            if len(i) % 2 != 0:
                return False

            mid = len(i) // 2

            left = sum(int(d) for d in i[:mid])
            right = sum(int(d) for d in i[mid:])

            return left == right

        count = 0
        for i in range(low,high+1):
            if is_symmetric(i):
                count += 1

        return count
