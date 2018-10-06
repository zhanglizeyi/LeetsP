/**
Problem: Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.


example:
Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Solution: Iteration and using modules 2 to distinct even or odd number and save them from left to right with even and right to left with odd. 

*/

class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        int[] nums = new int[A.length];
        int evenCount=0, oddCount=A.length-1;
        
        for(int i=0; i<A.length; i++) {
            if(A[i] % 2 == 0) {
                //even
                nums[evenCount++] = A[i];
            } else {
                //odd
                nums[oddCount--] = A[i];
            }
        }
        return nums;
    }
}
