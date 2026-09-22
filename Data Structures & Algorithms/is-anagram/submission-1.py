class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if (len(t)!=len(s)):
            return False
        for i in s:
            if i in t:
                continue
            return False
        return True