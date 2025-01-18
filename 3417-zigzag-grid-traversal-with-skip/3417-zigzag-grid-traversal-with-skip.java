class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> result = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        boolean include = true; // Determines whether to include a cell in the result

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) { // Traverse left-to-right
                for (int j = 0; j < n; j++) {
                    if (include) {
                        result.add(grid[i][j]);
                    }
                    include = !include; // Toggle inclusion
                }
            } else { // Traverse right-to-left
                for (int j = n - 1; j >= 0; j--) {
                    if (include) {
                        result.add(grid[i][j]);
                    }
                    include = !include; // Toggle inclusion
                }
            }
        }
        
        return result;
    }
}
