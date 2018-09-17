/**
Problem:
	Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

You need to find the shortest such subarray and output its length.

Solution: Clone and Sort array, check the difference between those two arrays whenever the first difference happen then input index to start and second/rest diffs will update to end. 

Example:
	[1,2,3,6,5,4,8,9,7,10,11,12]

start=12 end=0
input: 1 2 3 6 5 4 8 9 7 10 11 12
sort:  1 2 3 4 5 6 7 8 9 10 11 12
index: 0 1 2 3 4 5 6 7 8 9  10 11
       | | | | | | | | | |   |  |               
             3
             3
                3
                5
                  3
                  6
                    3
                    7   
                       3
                       8
if 8-3 != 0 then 6 else 0

*/

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int start=nums.length-1, end=0;
        int[] temp = nums.clone();
        Arrays.sort(temp);
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != temp[i]) {
                if(start != nums.length-1) {
                    end=i;
                } else {
                    start=i;
                }
            }
        }

        return end-start > 0 ? end-start+1 : 0;
    }
}


