# Last updated: 09/10/2026, 09:51:46
1class Solution:
2    def maxArea(self, height: List[int]) -> int:
3        max_area = 0
4        left = 0
5        right = len(height) - 1
6
7        while left < right:
8            max_area = max(max_area, (right - left) * min(height[left], height[right]))
9
10            if height[left] < height[right]:
11                left += 1
12            else:
13                right -= 1
14        
15        return max_area