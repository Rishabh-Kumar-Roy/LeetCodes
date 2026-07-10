class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        max=-1
        sum=0
        m=len(accounts)
        n=len(accounts[0])
        for i in range(m):
            for j in range (n):
                sum+=accounts[i][j]
            if sum>max:
                max=sum
            sum=0
        return max