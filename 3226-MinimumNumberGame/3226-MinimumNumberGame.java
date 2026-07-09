// Last updated: 09/07/2026, 15:05:58
class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] output = new int[nums.length];
        for(int i=0;i<nums.length;i+=2){
            output[i]=nums[i+1];
            output[i+1]=nums[i];
        }
        return output; 
    }
}