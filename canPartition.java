class Solution {
    public boolean canPartition(int[] nums) {
        
        int n = nums.length;
        int sum = 0;
        for(int i : nums) {
            sum+=i;
        }
        if(sum % 2 != 0) return false;
        sum /= 2;
        Boolean [][] dp = new Boolean[n+1][sum+1];

        return helper(nums, n, sum, dp);
    }

    public boolean helper(int[] nums, int n, int sum, Boolean [][] dp){
        if(sum == 0) return true;
        if(n == 0) return false;
        if(dp[n][sum] != null) return dp[n][sum];
        if(nums[n-1] <= sum) {
            return dp[n][sum] = helper(nums, n-1, sum-nums[n-1], dp) || helper(nums, n-1, sum, dp);
        }

        return dp[n][sum] = helper(nums, n-1, sum, dp);
    }
}
