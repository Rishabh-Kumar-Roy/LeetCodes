class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        total=sum(nums)
        l=0
        r=total-l
        for i in range(len(nums)):
            
            if(l==total-nums[i]-l):
                return i
            l+=nums[i]
        return -1
        