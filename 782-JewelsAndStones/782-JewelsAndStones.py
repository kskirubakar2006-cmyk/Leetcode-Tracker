# Last updated: 09/07/2026, 15:07:13
class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        jewel_set = set(jewels)
        count =0
        for stone in stones:
            if stone in jewel_set:
                count+=1
        return count                