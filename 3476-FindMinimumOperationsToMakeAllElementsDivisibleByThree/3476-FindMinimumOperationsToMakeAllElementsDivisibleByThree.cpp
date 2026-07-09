// Last updated: 09/07/2026, 15:05:55
class Solution {
public:
    int minimumOperations(vector<int>& nums) {
        int count = 0;
        for(int x:nums){
            if(x%3!=0){
                count ++;
            }
        }
        return count;
        
        
    }
};