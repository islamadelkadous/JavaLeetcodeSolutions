class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] cache = new int[row][col]; // Memoization table
        int result = 0;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result = Math.max(result, dfs(matrix, i, j, row, col, cache, -1));
            }
        }
        return result;
    }

    private int dfs(int[][] matrix, int x, int y, int row, int col, int[][] cache, int prev) {
        // Check boundaries
        if (x >= row || x < 0 || y >= col || y < 0 || matrix[x][y] <= prev) {
            return 0;
        }
        
        // If already computed, return cached result
        if (cache[x][y] != 0) {
            return cache[x][y];
        }
        
        // Explore all four directions
        int maxLength = 1 + Math.max(
            Math.max(
                dfs(matrix, x + 1, y, row, col, cache, matrix[x][y]),
                dfs(matrix, x - 1, y, row, col, cache, matrix[x][y])
            ),
            Math.max(
                dfs(matrix, x, y + 1, row, col, cache, matrix[x][y]),
                dfs(matrix, x, y - 1, row, col, cache, matrix[x][y])
            )
        );
        
        // Cache the result
        cache[x][y] = maxLength;
        return maxLength;
    }
}
