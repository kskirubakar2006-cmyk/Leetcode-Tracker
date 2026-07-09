// Last updated: 09/07/2026, 15:06:43
class Solution {
    public int numIdenticalPairs(int[] nums) {
       
        int ans = 0, cnt[] = new int[101];
        for (int a: nums) {
            ans += cnt[a]++;
        }
        return ans;
    }
}
        
    
