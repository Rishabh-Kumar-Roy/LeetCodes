class Solution:
    def majorityElement(self, nums: list[int]) -> int:
        candi=nums[0]
        count=0
        for i in nums:
            if i == candi:
                count=count+1
            else:
                count=count-1
                if count==0:
                    candi=i
                    count=count+1
        return candi
            
        