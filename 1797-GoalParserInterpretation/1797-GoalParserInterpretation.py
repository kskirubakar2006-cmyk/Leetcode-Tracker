# Last updated: 09/07/2026, 15:06:37
class Solution:
    def interpret(self, command: str) -> str:
        return command.replace("G","G").replace("()","o").replace("(al)","al")
        