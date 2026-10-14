class Solution:
    def longestConsecutive(self, nums: list[int]) -> int:
        s=set(nums)
        ans=0
        for i in (s):
            count=0
            if i-1 not in s:
                curr=i
                count=1
                while(curr+1 in s):
                    curr+=1
                    count+=1
                ans=max(ans,count)
        return ans



        