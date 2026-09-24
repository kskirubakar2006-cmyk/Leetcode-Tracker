# Last updated: 24/09/2026, 22:35:07
1class Solution:
2    def licenseKeyFormatting(self, s: str, k: int) -> str:
3        return '-'.join(map(''.join,batched(re.sub('-','',s).upper()[::-1],k)))[::-1]