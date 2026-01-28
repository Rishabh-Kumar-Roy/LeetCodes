class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        ans=0
        l=0
        s1=set()
        for i in range(len(s)):
            while(s[i] in s1):
                s1.remove(s[l])
                l=l+1
            s1.add(s[i])
            ans=max(ans,len(s1))
        return ans

                
