// Last updated: 09/07/2026, 15:11:05
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[256];

            for (int j = i; j < n; j++) {
                if (freq[s.charAt(j)] > 0) {
                    break;
                }

                freq[s.charAt(j)]++;
                ans = Math.max(ans, j - i + 1);
            }
        }

        return ans;
    }
}