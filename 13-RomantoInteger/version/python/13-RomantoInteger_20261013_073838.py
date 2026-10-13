# Last updated: 13/10/2026, 07:38:38
1class Solution:
2    def romanToInt(self, s: str) -> int:
3        res = 0
4        roman = {
5            'I': 1,
6            'V': 5,
7            'X': 10,
8            'L': 50,
9            'C': 100,
10            'D': 500,
11            'M': 1000
12        }
13
14        for a, b in zip(s, s[1:]):
15            if roman[a] < roman[b]:
16                res -= roman[a]
17            else:
18                res += roman[a]
19
20        return res + roman[s[-1]] 