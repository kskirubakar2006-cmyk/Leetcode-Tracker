# Last updated: 09/07/2026, 15:10:28
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 1

        for j in range(1, len(nums)):
            if nums[j] != nums[i - 1]:
                nums[i] = nums[j]
                i += 1
        
        return i