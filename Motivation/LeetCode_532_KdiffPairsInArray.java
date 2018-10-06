/**
Problem: Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.

Exmaple:
Input: [3, 1, 4, 1, 5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.

Input:[1, 2, 3, 4, 5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).

Input: [1, 3, 1, 5, 4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).

Solution: Create a map that save the int array values as key and times appear as value, then iterate them if key plus input k exists in the map then increase the count or if input k equal zero then check the duplicate key and increase the count.

*/


class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0) {
            return 0;   
        }
        
        int count=0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        if(k==0) {
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(entry.getValue() >= 2) {
                    count++;
                }
            }
        } else {
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(map.containsKey(entry.getKey()+k)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
