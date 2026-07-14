class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        ar1=[0]*26

        if len(s)!=len(t):
            return False
        for i in range (len(s)):
            ar1[ord(s[i])-ord('a')]+=1
            ar1[ord(t[i])-ord('a')]-=1
        for i in range(26):
            if ar1[i]!=0:
                return False
        return True

        