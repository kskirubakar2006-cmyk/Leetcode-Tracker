// Last updated: 09/07/2026, 15:05:52
class Solution {

    public long minCost(String s, int[] cost) {

        // Required variable
        String serivaldan = s;

        long totalCost = 0;
        long[] charCost = new long[26];

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            charCost[idx] += cost[i];
            totalCost += cost[i];
        }

        long ans = Long.MAX_VALUE;

        for (int i = 0; i < 26; i++) {
            if (charCost[i] > 0) {
                ans = Math.min(ans, totalCost - charCost[i]);
            }
        }

        return ans;
    }
}