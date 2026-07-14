class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        chara={}
        for i in range(len(s)):
            if s[i] in chara:
                chara[s[i]]+=1
            else:
                chara[s[i]]=1
        for j in range(len(t)):
            if t[j] in chara:
                chara[t[j]]-=1
            else:
                return False
        for k in chara:
            if chara[k]!=0:
                return False
        return True

        
        