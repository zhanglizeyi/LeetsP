/*
Problem: 

Given a matrix A, return the transpose of A.

The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.

Solution:

1. Get row and column from original double array A
2. Create new double array with first array as A[0].length and second array as A.length
3. Double iterations for A and store values into new double array 
*/

class Solution {
    public int[][] transpose(int[][] A) {    
        int row = A.length;
        int column = A[0].length;
        int[][] newList = new int[column][row];   
            
        for(int i=0; i < A.length; i++) {
            for(int j=0; j < A[i].length; j++) {
                newList[j][i] = A[i][j];
            }
        }
        return newList;
    }
}

