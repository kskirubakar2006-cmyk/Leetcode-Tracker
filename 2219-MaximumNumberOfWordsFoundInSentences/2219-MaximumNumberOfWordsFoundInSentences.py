# Last updated: 09/07/2026, 15:06:23
class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
       return max(sentence.count(' ')+1 for sentence in sentences)
        