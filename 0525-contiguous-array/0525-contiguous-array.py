class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        for i in range(len(nums)):
            if nums[i]==0:
                nums[i]=-1
        hm={0:-1}
        maxlen=0
        sum=0
        for i in range(len(nums)):
            sum+=nums[i]
            if sum in hm:
                maxlen=max(maxlen,i-hm[sum])
            else:
                hm[sum]=i
            
        return maxlen 

        