# Last updated: 09/07/2026, 15:05:48
class Solution:
    def firstUniqueEven(self, nums: list[int]) -> int:
        for i in range(len(nums)):
            if nums[i] % 2 ==0:
                count =0
                
                for j in range(len(nums)):
                    if nums[i] == nums[j]:
                       count = count+1
                if count==1:
                    return nums[i]
               
        return -1
                         
                
            