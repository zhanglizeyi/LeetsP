/*
Problem:

Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].

Solution:

1. Get double array's length and its element's length
2. Iteration for outside length and inner iteration for each row's elems
3. New double arrays will hold flipping value from the original array object and conditional chekck will invert value 
*/
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
    
        int[][] newList = new int[A.length][A[0].length];
        int row = 0;
        
        for(int i=0; i<A.length; i++) {   
            int column = 0;
            for(int j=A[0].length-1; j>=0; j--) {
                newList[row][column] = A[i][j];
                if(newList[row][column] == 0) {
                    newList[row][column] = 1;
                } else {
                    newList[row][column] = 0;
                }
                column++;
            }
            row++;
        }        
        return newList;
    }
}
