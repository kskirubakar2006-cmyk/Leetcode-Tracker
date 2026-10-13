# Last updated: 13/10/2026, 07:37:25
1class Solution:
2    def isPalindrome(self, x: int) -> bool:
3        if x < 0:
4            return False
5
6        reverse = 0
7        xcopy = x
8
9        while x > 0:
10            reverse = (reverse * 10) + (x % 10)
11            x //= 10
12        
13        return reverse == xcopy