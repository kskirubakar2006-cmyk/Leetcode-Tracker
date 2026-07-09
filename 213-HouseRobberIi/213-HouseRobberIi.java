// Last updated: 09/07/2026, 15:08:15
class Solution {

    public int rob(int[] nums) {

        int n = nums.length;

        // Edge case
        if(n == 1) return nums[n - 1];

        int[] dp1 = new int[n];
        int[] dp2 = new int[n];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        // Case 1: Exclude last house
        int case1 = maximum(n - 2, 0, nums, dp1);

        // Case 2: Exclude first house
        int case2 = maximum(n - 1, 1, nums, dp2);

        return Math.max(case1, case2);
    }

    public int maximum(int index, int i, int[] nums, int[] dp) {

        // Base cases
        if(i == 0 && index == 0) return nums[index];
        if(i == 1 && index == 1) return nums[index];

        if(index < i) return 0;

        // Already computed
        if(dp[index] != -1) return dp[index];

        // Pick current house
        int pick = nums[index] + maximum(index - 2, i, nums, dp);

        // Skip current house
        int notPick = maximum(index - 1, i, nums, dp);

        // Store and return answer
        return dp[index] = Math.max(pick, notPick);
    }
}