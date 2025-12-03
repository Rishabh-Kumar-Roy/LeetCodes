class Solution:
    def reverse(self, x: int) -> int:
        rev=0
        if x>0:
            s=1
        else:
            s=-1
        x=abs(x)
        while x>0:
            dig=x%10
            rev=rev*10+dig
            x=x//10
        rev*=s
        if rev> 2**31 -1 or rev< -2**31 :
            return 0
        return rev