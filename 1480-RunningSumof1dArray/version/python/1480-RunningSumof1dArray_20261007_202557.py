# Last updated: 07/10/2026, 20:25:57
1class Solution:
2    def runningSum(self, nums: list[int]) -> list[int]:
3        count=0
4        out=[]
5        for i in range(len(nums)):
6            count=count+nums[i]
7            out.append(count)
8        return out    
9
10
11
12        