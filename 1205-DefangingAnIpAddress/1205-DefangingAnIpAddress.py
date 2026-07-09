# Last updated: 09/07/2026, 15:06:55
class Solution:
    def defangIPaddr(self, address: str) -> str:
        return address.replace(".","[.]")
        
        