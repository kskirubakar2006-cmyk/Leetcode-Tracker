# Last updated: 24/09/2026, 22:34:32
1class Solution:
2    def magicalString(self, n: int) -> int:
3
4        arr, i = [1,2,2], 2
5   
6        while len(arr) < n:
7            arr.extend([arr[-1]^3]*arr[i])
8            i += 1
9    
10        return arr[:n].count(1)