// Last updated: 09/07/2026, 15:07:44
class Solution {
    public int hammingDistance(int x, int y) {
        int n = x^y;
        int count = 0;
        while(n!=0){
            if((n&(1<<0)) != 0){
                count ++;
            }
            n=n>>1;
        }
        return count;
        
    }
}