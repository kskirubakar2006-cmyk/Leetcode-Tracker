// Last updated: 09/07/2026, 15:06:17
class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int count=0;
        for(int x:nums){
            if(x%2==0&&x%3==0){
                sum=sum+x;
                count++;
            }
        }
        return count==0?0:sum/count;
        
    }
}