// Last updated: 09/07/2026, 15:07:38
class Solution {
    public boolean checkPerfectNumber(int num) {
        int a=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                a=a+i;
            }
        }
        if(a==num){
            return true;
        }
        else{
            return false;
        }
    }
}