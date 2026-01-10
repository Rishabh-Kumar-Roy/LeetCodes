class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        grp={}
        ans=[]
        for i in nums:
            if i in grp:
                grp[i]+=1
            else:
                grp[i]=1
        arr=list(grp.items())
        arr.sort(key=lambda x:x[1],reverse=True)
        for i in range (k):
            ans.append(arr[i][0])
        return ans

        