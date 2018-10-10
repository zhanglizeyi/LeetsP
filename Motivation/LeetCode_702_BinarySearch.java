/**
Problem: Given an integer array sorted in ascending order, write a function to search target in nums.  If target exists, then return its index, otherwise return -1. However, the array size is unknown to you. You may only access the array using an ArrayReader interface, where ArrayReader.get(k) returns the element of the array at index k (0-indexed).

You may assume all integers in the array are less than 10000, and if you access the array out of bounds, ArrayReader.get will return 2147483647.

Example:
Input: array = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

Input: array = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1


Solution: Binary Search with the maxmium size

*/



class Solution {
    public int search(ArrayReader reader, int target) {
        int start = 0;
        int end = Integer.MAX_VALUE;
        
        while(start + 1 < end) {
            int mid = start + (end - start) / 2; 
            if(reader.get(mid) == target) {
                return mid;
            } else if(reader.get(mid) < target){
                start = mid;
            } else {
                end = mid;
            }
        }
        
        if(reader.get(start) == target) {
            return start;
        }
        if(reader.get(end) == target) {
            return end;
        }
        
        return -1;
    }
}
