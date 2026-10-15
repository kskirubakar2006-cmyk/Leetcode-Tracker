# Last updated: 15/10/2026, 19:35:47
1class Solution:
2    def singleNumber(self, nums: list[int]) -> int:
3        result =0 
4        for num in nums:
5            result ^= num
6        return result     
7
8        