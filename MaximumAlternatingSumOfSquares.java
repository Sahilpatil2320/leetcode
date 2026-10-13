import java.util.Arrays;

class MaximumAlternatingSumOfSquares {
    public long maxAlternatingSum(int[] nums) {
        Arrays.sort(nums);

        long sum = 0;
        int n = nums.length;

        long[] squares = new long[n];

        for (int i = 0; i < n; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(squares);

        for (int i = 0; i < n / 2; i++) {
            sum -= squares[i];
        }

        for (int i = n / 2; i < n; i++) {
            sum += squares[i];
        }

        return sum;
    }
}