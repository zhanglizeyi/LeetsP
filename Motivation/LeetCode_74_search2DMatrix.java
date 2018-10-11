/**
Problem: Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.

Example:
Input:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 3
Output: true

Input:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 13
Output: false

Solution: binary search plus iteration of each roles. 
Run time: O(n*log(n)) Space: O(1)

*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) {
            return false;
        }
        if(matrix.length == 1 && matrix[0].length == 0) { 
            return false; 
        }
        
        for(int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[i].length - 1;
            while(start + 1 < end) {
                int mid = start + (end - start) / 2;
                if(matrix[i][mid] == target) {
                    return true;
                } else if(matrix[i][mid] > target) {
                    end = mid;
                } else {
                    start = mid;
                }
            }
            
            if(matrix[i][start] == target) {
                return true;
            } else if(matrix[i][end] == target) {
                return true;
            }
        }
        
        return false;
    }
}
