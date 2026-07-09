// Last updated: 09/07/2026, 15:08:45
class Solution {
    public int trailingZeroes(int n) {
         int count=0;
        while(n>=5){
            count+=(n/5);
            n=n/5;
        }
        return count;
        
    }
}