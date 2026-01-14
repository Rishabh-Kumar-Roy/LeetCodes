class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        s=set()
        val=0
        for i in range (9):
            s=set()
            for j in range(9):
                val=(board[i][j])
                if val=='.':
                    continue
                if val not in s:
                    s.add(val)
                else:
                    return False
            
        val=0
        for i in range (9):
            s=set()
            for j in range(9):
                val=(board[j][i])
                if val=='.':
                    continue
                if val in s:
                    return False
                else:
                     s.add(val)
          
        
        for row in [0,3,6]:
            
            for col in  [0,3,6]:
                s=set()
                for i in range (3):
                    for j in range(3):
                        val=board[row+i][col+j]
                        if val=='.':
                            continue
                        if val in s:
                            return False
                        else:
                            s.add(val)
                    
        
        return True

        

        