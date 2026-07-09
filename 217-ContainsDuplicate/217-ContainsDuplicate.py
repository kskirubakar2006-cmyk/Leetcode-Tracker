# Last updated: 09/07/2026, 15:08:13
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        nums_set = set(nums)
        list_nums = list(nums_set)
        if(len(nums) == len(list_nums)):
            return False
        else:
            return True


        