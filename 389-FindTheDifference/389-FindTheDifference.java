// Last updated: 09/07/2026, 15:07:54
class Solution {
    public char findTheDifference(String s, String t) {
     
        char c = 0;
        for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : t.toCharArray()) c ^= ct;
        return c;
    }
}

        
