// Last updated: 09/07/2026, 15:07:49
class Solution {
    public String toHex(int num) {
     
        if (num == 0) {
            return "0";
        }

        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder();

        // Process at most 8 hex digits (32 bits)
        while (num != 0) {
            int digit = num & 0xF;      // last 4 bits
            result.append(hex[digit]);
            num >>>= 4;                 // unsigned right shift
        }

        return result.reverse().toString();
    }
}

        
    