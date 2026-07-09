# Last updated: 09/07/2026, 15:06:39
class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        maximum =0
        for customer in accounts:
            wealth =0
            for money in customer:
                wealth+=money
            if wealth>maximum:
                maximum = wealth
        return maximum            
                   

        