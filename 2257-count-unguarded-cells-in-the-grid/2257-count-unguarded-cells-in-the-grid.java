import java.util.*;

class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];

        // Mark walls as -1, guards as 2
        for (int[] w : walls)
            grid[w[0]][w[1]] = -1;

        for (int[] g : guards)
            grid[g[0]][g[1]] = 2;

        // Directions: up, down, left, right
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        // For each guard, mark visible cells until a wall or guard blocks the path
        for (int[] g : guards) {
            for (int[] d : dirs) {
                int r = g[0] + d[0];
                int c = g[1] + d[1];
                while (r >= 0 && r < m && c >= 0 && c < n && grid[r][c] != -1 && grid[r][c] != 2) {
                    // Mark cell as guarded (1)
                    if (grid[r][c] == 0)
                        grid[r][c] = 1;
                    r += d[0];
                    c += d[1];
                }
            }
        }

        // Count unguarded cells (0)
        int unguarded = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0)
                    unguarded++;
            }
        }

        return unguarded;
    }
}