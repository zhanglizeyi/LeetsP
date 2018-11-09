/**
Problem: 
Let's call an array A a mountain if the following properties hold:

A.length >= 3
There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].

Example: 
Input: [0,1,0]
Output: 1

Solution: Sliding window, using three pointers or binary search 

*/

//Three pointers
class Solution {
    public int peakIndexInMountainArray(int[] A) {

        int start = 0, mid = 1;
        for(int i=2; i < A.length; i++) {
            if(A[start] < A[mid] && A[mid] > A[i]) {
                return mid;
            }
            start++;
            mid++;
        }

        return -1;
    }
}

//Binary search
class Solution {
    public int peakIndexInMountainArray(int[] A) {

        int start = 0;
        int end = A.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if(A[mid] < A[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
}
