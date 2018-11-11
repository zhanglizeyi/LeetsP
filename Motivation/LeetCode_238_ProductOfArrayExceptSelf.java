/**
Problem: 
Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:
Input:  [1,2,3,4]
Output: [24,12,8,6]


Solution: Iteration from left to right, add up the pervious sum. And, iterate right to left product two list's value.

*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
//         if(nums.length == 0) {
//             return new int[0];
//         }
        
//         int[] ret = new int[nums.length];
    
//         for(int i = 0; i < ret.length; i++) {
//             int count = 1;
//             for(int j = 0; j < nums.length; j++) {
//                 if(i != j) {
//                     count *=  nums[j];
//                 }
//             }
//             ret[i] = count;
//         }
        
//         return ret;
        int[] res = new int[nums.length];
        int p = 1;
        for(int i = 0; i < nums.length; i++) {
            res[i] = p;
            p *= nums[i];
        }
    
        p = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            res[i] *= p;
            p *= nums[i];
        }
        
        return res;
    }
}
