class Solution:
    def isPalindrome(self, s: str) -> bool:
        s1=""
        for c in s:
            if c.isalnum():
                s1+=c.lower()
        l=len(s1)
        for c in range (l):
            if s1[c]!=s1[l-c-1]:
                return False
        return True

            

        