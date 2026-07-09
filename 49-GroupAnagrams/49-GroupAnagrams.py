# Last updated: 09/07/2026, 15:09:53
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        h = {}
        ans = []

        for i in strs:
            k = ''.join(sorted(i))

            if k in h:
                h[k].append(i)
            else:
                h[k] = [i]

        for k, v in h.items():
            ans.append(v)

        return ans