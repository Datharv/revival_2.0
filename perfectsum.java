class Solution {
    // Function to calculate the number of subsets with a given sum
    static int count = 0;
    
    public int countZeros(int[] nums) {
        int count = 0;
        for(int i : nums) {
            if(i == 0) count++;
        }
        
        return count;
    }
    public int perfectSum(int[] nums, int sum) {
        // code here
        int n = nums.length;
        int [][] dp = new int[n+1][sum+1];
        for(int [] row:dp) {
            Arrays.fill(row, -1);
        }
        
        int count = countZeros(nums);
        int ans = helper(nums, n, sum, dp);
        return ans * (int)Math.pow(2, count);
    }
    public int helper(int[] nums, int n, int sum, int [][] dp){
        if(sum == 0) return 1;
        if(n == 0) return 0;
        if(dp[n][sum] != -1) return dp[n][sum];
        int left = 0;
        if(nums[n-1] <= sum && nums[n-1] != 0) {
            left = helper(nums, n-1, sum-nums[n-1], dp);
        }

        int right = helper(nums, n-1, sum, dp);
        return dp[n][sum] = left + right;
    }
}
