# Last updated: 07/10/2026, 20:25:21
1class Solution:
2    def findNumbers(self, nums: list[int]) -> int:
3        count=0
4        for i in nums:
5            if (i>=10 and i<100) or (i>=1000 and i<10000) or (i>=100000 and i<1000000):
6                count=count+1
7        return count        
8
9
10
11
12        