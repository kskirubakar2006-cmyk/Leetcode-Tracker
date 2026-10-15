# Last updated: 15/10/2026, 19:59:47
1class Solution:
2    def findMaxConsecutiveOnes(self, nums: list[int]) -> int:
3        target =1 
4        m=0
5        n=0
6        for i in nums:
7            if i==target:
8                n+=1
9                m=max(m,n)
10            else:
11                n=0
12        return m            
13        