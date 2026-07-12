class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        ans=[]
        
        for i in range (len(candies)):
            flag=True

            for j in range (0,len(candies)):
                if(candies[i]+extraCandies)<candies[j]:
                    flag=False
                    break
               
            ans.append(flag)
        return ans

            

        