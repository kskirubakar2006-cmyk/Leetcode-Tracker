// Last updated: 09/07/2026, 15:06:49
class Solution {
public:
    int minCostToMoveChips(vector<int>& position) {
        int a=0;
        int b=0;
        for(int i:position){
            if(i%2==0){
                a++;
            }
            else{
                b++;
            }
        }
        if(a<b){
            return a;
        }
        else{
            return b;
        }
        
    }
};