/**
Problem:
485. Max Consecutive Ones
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.

Solution:
	Question is not cleaner in what should be count to be consecutive, since I create count to zeros and ones instead focus only on ones. 
	So a simple iteration will iterate all the 0s and 1s, and use a counter to handle the the consecutive part(Math.max).  

*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 0);
        
        int countZeros = 0;
        int countOnes = 0;
        //Iteration for all the consecutive 
        for(int i=0; i<nums.length; i++) {
            // if(nums[i] == 0) {
            //     countOnes = 0;
            //     countZeros++;
            //     int result = Math.max(countZeros, map.get(0));
            //     map.put(0, result);
            // }
            
            if(nums[i] == 1) {
                countOnes++;
                int result = Math.max(countOnes, map.get(1));
                map.put(1, result);
            } else {
                countOnes = 0;
            }
        }
        
        if(map.get(1) == 0) {
            return 0;
        }
        
        int retCount = map.get(0) > map.get(1) ? map.get(0) : map.get(1);
        
	/*
	Solution_1:
	int result = 0;
        int count = 0;
        
        //Iteration for all the consecutive 
        for(int i=0; i<nums.length; i++) {
            count++;
            if(nums[i] == 1) {
                result = Math.max(count, result);
            } else {
                count = 0;
            }
        }
	*/

        return retCount;
    }
} 
