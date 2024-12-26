class Solution {
    public String tictactoe(int[][] moves) {
        char[][] grid = new char[3][3];
        char currentPlayer = 'X';

        // Fill the grid based on the moves
        for (int i = 0; i < moves.length; i++) {
            int row = moves[i][0];
            int col = moves[i][1];
            grid[row][col] = currentPlayer;
            if (checkWinner(grid, currentPlayer)) {
                return currentPlayer == 'X' ? "A" : "B";
            }
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        return moves.length == 9 ? "Draw" : "Pending";
    }

    private boolean checkWinner(char[][] grid, char player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((grid[i][0] == player && grid[i][1] == player && grid[i][2] == player) || 
                (grid[0][i] == player && grid[1][i] == player && grid[2][i] == player)) {
                return true;
            }
        }

        // Check diagonals
        if ((grid[0][0] == player && grid[1][1] == player && grid[2][2] == player) || 
            (grid[0][2] == player && grid[1][1] == player && grid[2][0] == player)) {
            return true;
        }

        return false;
    }
}
