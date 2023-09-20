// Approach 1 -> For each row check if matrix[i][0] <= target && target <= matrix[i][j-1]
// If yes, pass that row to Binary Search Function
// Return bS(mat[i]), doing so will only pass the single row as a 1D array to bS function

// Approach 2 -> Treat the 2d as 1d array
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0;
        int high = rows * cols - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midR = mid / cols;
            int midC = mid % cols;
            int midValue = matrix[midR][midC];

            if (target == midValue) {
                return true;
            } else if (target < midValue) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}
