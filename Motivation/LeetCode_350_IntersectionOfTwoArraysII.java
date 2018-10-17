/**
Problem:
Given two arrays, write a function to compute their intersection.

Example:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]

Solution: Using a map to track one of the input array and mark key as its value and value as the appearing time. And then, iterating another array to check if any elements are matched in the map. 

*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums1) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i : nums2) {
            if(map.containsKey(i) && map.get(i) > 0) {
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        
        int[] nums = new int[list.size()];
        int count = 0;
        for(int i : list) {
            nums[count++] = i;
        }
        
        return nums;
    }
}
