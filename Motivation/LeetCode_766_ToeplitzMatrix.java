/*
Description:

A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.

Now given an M x N matrix, return True if and only if the matrix is Toeplitz. 

*/

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        /*
        The idea is to get the row and column avoid index 0 and whenever row hits 
        index 1+ then check condition will check if the column is also bigger than 1,
        if yes then it can check/compare the matrix[row-1][column-1] to match with current value.
        */   
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if(i > 0 && j > 0 && matrix[i-1][j-1] != matrix[i][j]) { 
                    return false;
                }
            }
        }
        
        /*
        Alternative solution for map which use the map to holds the index and 
        compare values from the map and matrix iff the map contains the key.
        */
        
//         Map<Integer, Integer> map = new HashMap<>();
        
//         for(int i=0; i<matrix.length; i++) {
//             for (int j=0; j<matrix[i].length; j++) {
//                 // i-j 
//                 if(!map.containsKey(i-j)) {
//                     map.put(i-j, matrix[i][j]);
//                 } else { 
//                     if(matrix[i][j] != map.get(i-j)) {
//                         return false;
//                     }
//                 }
//             }
//         }
        
        
        
        return true;
    }
}
