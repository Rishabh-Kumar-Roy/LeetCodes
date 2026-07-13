class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
       
        seta=set(nums)
        if len(seta)==len(nums):
            return False
        return True

        