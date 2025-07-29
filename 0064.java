class Solution {
    public int minPathSum(int[][] grid) {
        if(grid.length == 0 ) {
            return 0;
        }
        if(grid.length == 1 && grid[0].length == 1) {
            return grid[0][0];
        }
        return dfs(grid, 0, 0, grid.length, grid[0].length);
    }

    private int dfs(int[][] grid, int i, int j, int row, int col) {
        if (i < 0 || i >= row || j < 0 || j >= col) {
            return Integer.MAX_VALUE;
        }
        if(i == row-1 && j == col - 1) {
            return grid[i][j];
        }
        return grid[i][j] + Math.min(
            dfs(grid, i + 1, j, row, col),
            dfs(grid, i, j+1, row, col)
        );
    }
}
