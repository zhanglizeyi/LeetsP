/**
Problem: 
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].

Return true if and only if the given array A is monotonic.

Solution: Check the first and last array's values and compare them to put array into iteration. If increasment or decrsement fail in the scenario, then return faluse. Otherwise, true.
*/

class Solution {
    public boolean isMonotonic(int[] A) {
        if(A.length <= 1) {
            return true;
        }
        
        if(A[0] < A[A.length-1]) {
            for(int i=1; i<A.length; i++) {
                if(A[i-1] > A[i]) {
                    return false;
                }
            }
        } else {
            for(int i=1; i<A.length; i++) {
                if(A[i-1] < A[i]) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
