/**
Problem:
Given an array, rotate the array to the right by k steps, where k is non-negative.

Solution:
	Rotate left subarray and rotate right subarray and rotate all together.

Example:
[1,2,3,4,5,6] 3
k = 3 % 7 = 3
start = 7 - 3 = 4;

//left ==> [1,2,3,4,5,6,7] 0 - 3
    1. [4,2,3,1,5,6,7] 1, 2
    2. [4,3,2,1,5,6,7] 2, 1
//right ==> [4,3,2,1,5,6,7] 4, 6
    1. [4,3,2,1,7,6,5] 5, 5
//all [4,3,2,1,7,6,5] 0, 6
    1. [5,3,2,1,7,6,4] 1, 5
    2, [5,6,2,1,7,3,4] 2, 4
    3. [5,6,7,1,2,3,4] 3, 3
*/

class Solution {
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length < 2) {
            return;
        }
        
        k = k % nums.length;
        int start = nums.length - k;
        System.out.println("k: " + k + " start: "+ start); 
        nums = reverse(nums, 0, start-1);
        nums = reverse(nums, start, nums.length-1);
        nums = reverse(nums, 0, nums.length-1);
    }
    
    private int[] reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
        return arr;
    }
}
