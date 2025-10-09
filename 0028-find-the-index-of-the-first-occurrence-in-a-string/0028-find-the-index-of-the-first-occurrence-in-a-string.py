class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if needle not in haystack:
            return -1
        l=len(needle)
        s=0
        e=l
        while(e<=len(haystack)):
            if(haystack[s:e]==needle):
                return s
            s=s+1
            e=e+1
        return -1