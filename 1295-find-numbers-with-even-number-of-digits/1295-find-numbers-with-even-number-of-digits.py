class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        count=0
        for i in nums:
            if (self.check(i)):
                count+=1
        return count
    def check(self,i:int)->bool:
        c=0
        while(i>0):
            i=i//10
            c+=1
        return c%2==0
        