class FindArrayConcatenationValue {
    public long findTheArrayConcVal(int[] nums) {
        long ans = 0;

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            String str = "" + nums[left] + nums[right];

            ans += Long.parseLong(str);

            left++;
            right--;
        }

        // If one element is left
        if (left == right) {
            ans += nums[left];
        }

        return ans;
    }
}