// Last updated: 09/07/2026, 15:09:26
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        
        int[] dp = new int[n + 1];
        // Initialize dp array with -1 to indicate uncomputed subproblems
        java.util.Arrays.fill(dp, -1);
        
        return helper(n, dp);
    }

    private int helper(int n, int[] dp) {
        if (n <= 2) {
            return n;
        }
        
        // If already computed, return cached result
        if (dp[n] != -1) {
            return dp[n];
        }
        
        // Store the result in dp table before returning
        dp[n] = helper(n - 1, dp) + helper(n - 2, dp);
        return dp[n];
    }
}