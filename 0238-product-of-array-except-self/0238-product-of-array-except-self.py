class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        s=1
        c=0
        res=[]
        pos=-1
        for i in range(len(nums)):
            if nums[i]==0:
                pos=i
                c+=1
        if c==0:
            for i in nums:
                s*=i
            for i in (nums):
                res.append(s//i)
            return res
        if c==1:
            for i in nums:
                if i!=0:
                    s*=i
            res=[0]*len(nums)
            res[pos]=s
            return res 
        return [0] * len(nums)

        


