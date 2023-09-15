class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        s = s.strip()
        l = s.rfind(" ")
        return len(s) - l -1