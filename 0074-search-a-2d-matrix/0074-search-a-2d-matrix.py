class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        l=0
        r=len(matrix[0])-1
        for i in range (len(matrix)):
            if matrix[i][0] > target:
                row = i - 1
                if row < 0:
                    return False
                while(r>=0 and matrix[row][r] >= target):
                    if (matrix[row][r]==target):
                        return True
                    r=r-1
        
        row = len(matrix) - 1
        r = len(matrix[0]) - 1
        
        while(r>=0 and matrix [row][r]>=target):
            if matrix [row][r]==target :
                return True
            r-=1
        return False


        