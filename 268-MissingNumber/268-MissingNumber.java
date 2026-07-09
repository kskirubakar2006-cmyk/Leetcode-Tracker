// Last updated: 09/07/2026, 15:08:03
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int esum=n*(n+1)/2;
        int numssum = 0;
        for(int x:nums){
            numssum = numssum+x;
        }
        return esum-numssum;

        
        
    }
}