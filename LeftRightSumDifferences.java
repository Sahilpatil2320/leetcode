class LeftRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {
        int [] leftSum = new int[nums.length];
        int [] rightSum = new int[nums.length];

        leftSum[0] = 0;
        for( int i = 1; i < nums.length; i++ ) {
            leftSum[i] = nums[i - 1] + leftSum[i - 1];
        }

        rightSum[nums.length - 1] = 0;
        for(int j = nums.length - 2; j >= 0; j--) {
            rightSum[j] = nums[j+1] + rightSum[j + 1];
        }

        int [] ans = new int[nums.length];
        for(int k = 0; k < nums.length; k++) {
            ans[k] = Math.abs(leftSum[k] - rightSum[k]);
        }

        return ans;
    }
}