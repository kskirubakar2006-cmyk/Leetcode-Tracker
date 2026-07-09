# Last updated: 09/07/2026, 15:06:24
class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        count=0
        for i in operations:
            if(i=='--X') or (i=='X--'):
                count-=1
            elif(i=='++X') or(i=='X++'):
                count+=1
        return count             