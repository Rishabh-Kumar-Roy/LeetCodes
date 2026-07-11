class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        
        maxi=0
        for i in sentences:
            count=0
            for j in i:
                if j==" ":
                    count+=1
            maxi=max(maxi,count)
        return maxi+1
                