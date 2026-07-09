# Last updated: 09/07/2026, 15:07:58
class Solution:
    def reverseString(self, s: List[str]) -> None:
       left=0
       right = len(s) - 1
       while left<right:
        s[left], s[right] = s[right], s[left]
        left+=1
        right-=1  



        