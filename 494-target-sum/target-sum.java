class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for (int n : nums) totalSum += n;
        
        if (Math.abs(target) > totalSum || (target + totalSum) % 2 != 0) return 0;
        
        int s1 = (target + totalSum) / 2;
        int[] dp = new int[s1 + 1];
        dp[0] = 1;
        
        for (int n : nums) {
            for (int i = s1; i >= n; i--) {
                dp[i] += dp[i - n];
            }
        }
        
        return dp[s1];
    }
}