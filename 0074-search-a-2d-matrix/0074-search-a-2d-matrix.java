// Approach 1 -> For each row check if matrix[i][0] <= target && target <= matrix[i][j-1]
// If yes , pass that row to Binary Search Function 
// Return bS(mat[i]) , doing so will only pass the single row as an 1d array to bS function
// Time complexity -> O(N) + O(log m)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // Treat the matrix as an 1D array of size (n*m)
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0 , high = rows*cols -1;

        while(low<=high){

            int mid = low + (high - low) / 2;
            int midR = mid / cols;
            int midC = mid % cols;

            if(target == matrix[midR][midC])return true;

            else if ( target > matrix[midR][midC]) low = mid + 1;

            else high = mid - 1;
        } 
         
         return false;
        
    }
}