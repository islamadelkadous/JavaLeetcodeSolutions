class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int l = 0;
        int r = rows * columns - 1;
        while (l <= r) {
            int mid = (l + r) /2;
            int i = mid / columns;
            int j = mid % columns;
            int midNum = matrix[i][j];

            if (midNum == target) {
                return true;
            } else if (midNum > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }
}
