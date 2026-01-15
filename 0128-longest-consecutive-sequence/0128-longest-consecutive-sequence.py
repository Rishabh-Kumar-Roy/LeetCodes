class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0
        nums.sort()
        c=1
        l=1
        for i in range(len(nums)-1):
            if nums[i]==nums[i+1]:
                continue
            elif nums[i+1]==nums[i]+1:
                c+=1
            else :
                c=1
            l=max(l,c)
        return l
        