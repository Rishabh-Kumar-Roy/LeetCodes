class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x<0:
            return False
        rev=0
        og=x
        while x>0:
            dig=x%10
            rev=rev*10+dig
            x=x//10
        if rev==og:
            return True
        return False