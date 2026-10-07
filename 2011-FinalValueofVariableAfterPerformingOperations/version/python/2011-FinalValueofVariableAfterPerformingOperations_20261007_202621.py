# Last updated: 07/10/2026, 20:26:21
1class Solution:
2    def finalValueAfterOperations(self, operations: list[str]) -> int:
3        x=0
4        for i in operations:
5            if i=="--X" or i=="X--":
6                x-=1
7            if i=="++X" or i=="X++":
8                x+=1 
9        return x          
10
11
12
13
14        