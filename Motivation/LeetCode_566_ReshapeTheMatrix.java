/**
Problem: 
566 Reshape the Matrix
	In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

Solution:
1. queue/array list to get all the numbers in sorting order and create new matrix to convert queue/array back to matrix;

2. Iteration run oringal matrix while proccessing the new matrix with the new column and row. 

3. Devide and Mol to soulve the problem as create a counter and make row as counter devide by input c and column mol input c ->  [counter / c][counter % c]. Every time when counter pass the input c, the [counter / c] will increase by the devition and moludle will handle the incresement of column. 
*/

class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] newArray = new int[r][c];
        int row = nums.length;
        int column = nums[0].length;
        //Check
        int matrixSize = row * column;
        int buildSize = r * c;
        //Size is not work for build a new matrix
        if(matrixSize < buildSize) {
            return nums;
        }
        //Create new 
        int[][] retMatrix = new int[r][c];
        int cc = 0;
        int rr = 0;
        
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[i].length; j++) {
                retMatrix[rr][cc] = nums[i][j];
                cc++;
                if(cc == c) {
                    rr++;
                    cc=0;
                }
            }
        }

	/*
        OPTION_1:	
	Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                q.add(nums[i][j]);
            }
        }
        
        int[][] retMatrix = new int[r][c];
        
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                retMatrix[i][j] = q.remove();
            }
        }
	*/

	/*
	OPTION_3:
	int count = 0;
        int[][] retMatrix = new int[r][c];
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                retMatrix[count / c][ count % c] = nums[i][j];
                count++;
            }
        }
	*/


        return retMatrix;
    }
}

