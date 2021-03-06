/**
Problem: Given an m * n matrix M initialized with all 0's and several update operations.

Operations are represented by a 2D array, and each operation is represented by an array with two positive integers a and b, which means M[i][j] should be added by one for all 0 <= i < a and 0 <= j < b.

You need to count and return the number of maximum integers in the matrix after performing all the operations.


Example: Input: 
m = 3, n = 3
operations = [[2,2],[3,3]]
Output: 4
Explanation: 
Initially, M = 
[[0, 0, 0],
 [0, 0, 0],
 [0, 0, 0]]

After performing [2,2], M = 
[[1, 1, 0],
 [1, 1, 0],
 [0, 0, 0]]

After performing [3,3], M = 
[[2, 2, 1],
 [2, 2, 1],
 [1, 1, 1]]

So the maximum integer in M is 2, and there are four of it in M. So return 4.


Solution: Find the intersection of the area and make the production.

*/


class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        
        for(int[] op:ops) {
            if(op[0] < m) {
                m = op[0];
            }
            if(op[1] < n) {
                n = op[1];
            }
        }
        
        return m*n;
    }
}
