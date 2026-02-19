class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        
        for(int [] nums : accounts){
            int sum = 0;
            for(int num: nums){
                sum+= num;
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}