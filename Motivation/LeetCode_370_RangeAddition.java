/**
Problem: Assume you have an array of length n initialized with all 0's and are given k update operations.

Each operation is represented as a triplet: [startIndex, endIndex, inc] which increments each element of subarray A[startIndex ... endIndex] (startIndex and endIndex inclusive) with inc.

Return the modified array after all k operations were executed.

Example: 
	Input: length = 5, updates = [[1,3,2],[2,4,3],[0,2,-2]]
	Output: [-2,0,3,5,3]

Solution: There has two options the first is very tradition for using two iterations to outter loop each set and retrieve the starting/ending point /value to update the result int array. The running time for this solutiion will be kind solw ~= O(n^2) and O(n). 
Second option is using the first iteration to add value in starting index of result array and the iff the ending index not larger than length-1 then subtract the value for ending index+1. Then iterate the result array and subtract the adjustants until the end.  
*/

class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] result = new int[length];
    
        for(int[] update:updates) {
            result[update[0]] += update[2];
            if(update[1] < length-1) {
                result[update[1]+1]-=update[2];
            }
        }
        
        for(int i=1; i<length; i++) {
            result[i] += result[i-1];
        }
        
        return result;
    }
}

/* option solution:
class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] result = new int[length];
        if(updates.length < 1) {
            return result;
        }
        
        for(int i=0; i<updates.length; i++) {
            int start = updates[i][0];
            int end = updates[i][1];
            int value = updates[i][2];
            for(int j=start; j<=end; j++) {
                result[j] += value;
            }
        }
        return result;
    }
}
*/
