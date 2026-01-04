class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        ck={}
        ck1={}
        for i in s:
            if i in ck:
                ck[i]+=1
            else:
                ck[i]=1
        for j in t:
            if j in ck1:
                ck1[j]+=1
            else:
                ck1[j]=1
        if (ck==ck1):
            return True
        return False
        
        

        