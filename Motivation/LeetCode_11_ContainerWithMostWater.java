/**
Problem: Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Example: 
	Input: [1,8,6,2,5,4,8,3,7]
	Output: 49

Solution: Using iteration to solve this problem O(n) and O(1) spaces, iterate the input array to find the minimum between starting index or ending index then, product the height with the distances. Increasing/decreasing the starting index or ending index by comparing which is smaller. Updating the max number for each run/ return result in the end.

*/


class Solution {
    public int maxArea(int[] height) {
        
        int max = 0, indexes=0;
        int start = 0;
        int last = height.length-1;
        
        while(start != last) {
            indexes = last - start;
            int h = Math.min(height[start], height[last]) * indexes;
            max = Math.max(h, max);
            
            if(height[start] < height[last]) {
                start++;
            } else {
                last--;
            }
        }
        
        return max;
    }
}     
