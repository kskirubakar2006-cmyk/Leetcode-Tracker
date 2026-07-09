// Last updated: 09/07/2026, 15:05:47
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumSingle =0,sumdouble=0;
        for (int num :nums){
            if (num<10) sumSingle +=num;
            else sumdouble += num;
        }
        return sumSingle>sumdouble || sumdouble>sumSingle;
        
    }
}