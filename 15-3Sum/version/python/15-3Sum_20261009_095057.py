# Last updated: 09/10/2026, 09:50:57
1class Solution:
2    def threeSum(self, nums: List[int]) -> List[List[int]]:
3        res = []
4        nums.sort()
5
6        for i in range(len(nums)):
7            if i > 0 and nums[i] == nums[i-1]:
8                continue
9            
10            j = i + 1
11            k = len(nums) - 1
12
13            while j < k:
14                total = nums[i] + nums[j] + nums[k]
15
16                if total > 0:
17                    k -= 1
18                elif total < 0:
19                    j += 1
20                else:
21                    res.append([nums[i], nums[j], nums[k]])
22                    j += 1
23
24                    while nums[j] == nums[j-1] and j < k:
25                        j += 1
26        
27        return res