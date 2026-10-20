class Solution:
    def maxArea(self, height: list[int]) -> int:
        start=0
        end=len(height)-1
        ans=0
        while(start<end):
            maxl=min(height[start],height[end])
            area=(end-start)*maxl
            ans=max(ans,area)
            if (height[start]<height[end]):
                start+=1
            else:
                end-=1
            
        return ans

        