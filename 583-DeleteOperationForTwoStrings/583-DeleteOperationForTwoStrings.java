// Last updated: 09/07/2026, 15:07:31
class Solution {
    int[][] dp;

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        dp = new int[m + 1][n + 1];

        for(int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return helper(word1, word2, m, n);
    }

    int helper(String s1, String s2, int m, int n) {

        if(m == 0) return n;
        if(n == 0) return m;

        if(dp[m][n] != -1) return dp[m][n];

        if(s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return dp[m][n] = helper(s1, s2, m - 1, n - 1);
        }

        return dp[m][n] = 1 + Math.min(
                helper(s1, s2, m - 1, n),
                helper(s1, s2, m, n - 1)
        );
    }
}