// Last updated: 09/07/2026, 15:05:57
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int t = x;
        while(x>0){
            sum+=x%10;
            x=x/10;
        }
        if(t%sum==x){
            return sum;
        }
        else{
            return -1;
        }
        
        
    }
}