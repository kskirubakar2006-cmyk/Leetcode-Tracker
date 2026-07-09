// Last updated: 09/07/2026, 15:08:04
class Solution {
    public int addDigits(int num) {
        if(num==0){
            return 0;

        }
        int remainder = num%9;
        return remainder ==0?9 :remainder;
        
    }
}