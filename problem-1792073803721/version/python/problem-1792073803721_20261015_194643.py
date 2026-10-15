# Last updated: 15/10/2026, 19:46:43
1class Solution:
2    def fib(self, n: int) -> int:
3        if n< 1:
4            return 0
5        if n==1:
6            return 1    
7
8        prev2 =0
9        prev1 =1
10        current =0
11
12        for i in range(2,n+1):
13             current = prev1+prev2
14             prev2 = prev1 
15             prev1 = current 
16        return current      
17        