class Solution:
    def isPalindrome(self, s: str) -> bool:
        end=len(s)-1
        start=0
        while(start<end):
            if not s[start].isalnum():
                start+=1
            elif not s[end].isalnum():
                end-=1
            else:
                if s[start].lower()!=s[end].lower():
                    return False
                end-=1
                start+=1
        return True
            
        