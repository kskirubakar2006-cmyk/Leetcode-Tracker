# Last updated: 09/10/2026, 10:13:46
1class Solution:
2    def moveZeroes(self, nums: list[int]) -> None:
3        write = 0
4        for i in range(len(nums)):
5            if nums[i]!=0:
6                nums[write],nums[i] = nums[i],nums[write]
7                write +=1
8        