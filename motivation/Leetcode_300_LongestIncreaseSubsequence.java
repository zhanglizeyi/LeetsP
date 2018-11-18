/**
Problem:
Given an unsorted array of integers, find the length of longest increasing subsequence.

Example:

Input: [10,9,2,5,3,7,101,18]
Output: 4 
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4. 

Solution: N^2 and N space for one solution, and NlogN for iteration and BSearch solution.

*/
class Solution {
    public int lengthOfLIS(int[] nums) {
        
//         int[] f = new int[nums.length]; 
//         int max = 0; 
        
//         for(int i = 0; i < nums.length; i++) {
//             f[i] = 1;
//             for(int j = 0; j < i; j++) {
//                 if(nums[j] < nums[i]) {
//                     f[i] = f[i] > f[j] + 1 ? f[i] : f[j] + 1;
//                 }
//             } 
//             max = Integer.max(max, f[i]);
//         }
//         return max;
        
        int[] store = new int[nums.length + 1];
        store[0] = Integer.MIN_VALUE;
        
        for(int i = 1; i <= nums.length; i++) {
            store[i] = Integer.MAX_VALUE;
        }
        
        for(int i = 0; i < nums.length; i++) {
            int start = 0; 
            int end = store.length - 1;
            while(start + 1 < end) {
                int mid = start + (end - start) / 2;
                if(store[mid] < nums[i]) {
                    start = mid;
                } else {
                    end = mid;
                }
            }
            store[end] = nums[i];
        }
        
        for(int i = nums.length; i >= 1; i--) {
            if(store[i] != Integer.MAX_VALUE) {
                return i;
            }
        }
        
        return 0;
    }
}
