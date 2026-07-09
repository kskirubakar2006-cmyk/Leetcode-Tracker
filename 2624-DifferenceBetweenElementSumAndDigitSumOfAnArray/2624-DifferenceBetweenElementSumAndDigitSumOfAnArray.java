// Last updated: 09/07/2026, 15:06:10
class Solution {
    public int differenceOfSum(int[] nums) {
        int esum=0;
        int dsum=0;
        for(int x: nums){
            esum=esum+x;
            while(x!=0){
                dsum=dsum+x%10;
                x/=10;    
            }
        }
        return Math.abs(esum-dsum);
        
    }
}