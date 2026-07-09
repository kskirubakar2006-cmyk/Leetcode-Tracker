// Last updated: 09/07/2026, 15:05:50
class Solution {
    public int findClosest(int x, int y, int z) {

        int d1 = Math.abs(x - z); 
        int d2 = Math.abs(y - z); 
        if(d1 < d2) return 1; 
        if(d2 < d1) return 2; 
        return 0; 
 
        
    }
}