class Solution {
    public int diagonalSum(int[][] mat) {
        int m = mat.length;
        int n = m / 2; 
        int sum = 0, sum1 = 0;

        for (int i = 0; i < m; i++) {
            sum += mat[i][i]; 
        }

        for (int i = 0, j = m - 1; i < m && j >= 0; i++, j--) {
            sum1 += mat[i][j]; 
        }

        if (m % 2 != 0) {
            return sum + sum1 - mat[n][n];
        }
        return sum + sum1;
    }
}