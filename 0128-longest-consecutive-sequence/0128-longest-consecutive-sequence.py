class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
       
        l=0
        len=0
        num_s=set(nums)
        for num  in num_s:
            if num-1 not in num_s:
                curr=num
                len=1
                while curr+1 in num_s:
                    curr+=1
                    len+=1
            l=max(len,l)
        return l

        