class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        if(row == 0 ) {
            return 0;
        }
        int col = grid[0].length;
        if(row == 1 && col == 1) {
            return grid[0][0];
        }
        for(int i=0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if (i > 0 && j > 0) {
                    grid[i][j] += Math.min(grid[i - 1][j], grid[i][j-1]);
                } else if (i > 0) {
                    grid[i][0] += grid[i - 1][0];
                } else if( j > 0) {
                    grid[0][j] += grid[0][j-1];
                }
            }
        }
        return grid[row-1][col-1];
    }
}

// class Solution {
//     public int minPathSum(int[][] grid) {
//         if(grid.length == 0 ) {
//             return 0;
//         }
//         if(grid.length == 1 && grid[0].length == 1) {
//             return grid[0][0];
//         }
//         return dfs(grid, 0, 0, grid.length, grid[0].length);
//     }

//     private int dfs(int[][] grid, int i, int j, int row, int col) {
//         if (i < 0 || i >= row || j < 0 || j >= col) {
//             return Integer.MAX_VALUE;
//         }
//         if(i == row-1 && j == col - 1) {
//             return grid[i][j];
//         }
//         return grid[i][j] + Math.min(
//             dfs(grid, i + 1, j, row, col),
//             dfs(grid, i, j+1, row, col)
//         );
//     }
// }
