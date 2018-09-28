/**
Problem: Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?

Example: 
Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]


Solution: Iteration and change the existing number into negative number, and if the negative number has hit again then it is a duplicated number. 

*/ 

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++) {
            int index = Math.abs(nums[i]);
            if(nums[index-1] < 0) {
                list.add(Math.abs(index));
            }
            nums[index-1] = -nums[index-1];  
        }
        return list;
    }
}
