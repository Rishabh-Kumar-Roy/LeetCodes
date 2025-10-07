class Solution:
    def firstUniqChar(self, s: str) -> int:
        ch={}
        for c in s:
            ch[c]=ch.get(c,0)+1

        for i in range(len(s)):
            if(ch[s[i]]==1):
                return i

        return -1