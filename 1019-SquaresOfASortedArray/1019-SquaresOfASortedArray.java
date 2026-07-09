// Last updated: 09/07/2026, 15:07:05
class Solution {
    public int[] sortedSquares(int[] nums) {    
        int i = 0;
        int j = nums.length - 1;
        int k = j;

        int[] newL = new int[nums.length];

        while (i < j) {
            int iSquare = nums[i] * nums[i];
            int jSquare = nums[j] * nums[j];

            if (iSquare > jSquare) {
                newL[k--] = iSquare;
                i++;
            } else {
                newL[k--] = jSquare;
                j--;
            }
        }

        newL[0] = nums[i] * nums[i];
        return newL;
    }
}