class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freqc={}
        for i in nums:
            if i in freqc:
                freqc[i]+=1
            else:
                freqc[i]=1
        ans=sorted(freqc,key=freqc.get, reverse=True)
        return ans[:k]
        