class Solution:
    def twoSum(self, number: List[int], target: int) -> List[int]:

        i=0
        a=len(number)-1
        while(i<=a):
            if number[i]+number[a]==target:
                return [i+1,a+1]
            elif number[i]+number[a]<target:
                i+=1
            elif number[i]+number[a]>target:
                a-=1

        