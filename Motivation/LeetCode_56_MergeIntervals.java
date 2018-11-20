/**
Problem: 
Given a collection of intervals, merge all overlapping intervals.

Example:

Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considerred overlapping.

Solution: Sorting original array by using comparator, then compare the first obj's end with next obj's start, if start less and equal than previous obj's start, update the previous obj, otherwise save previous into new list and update previous to current and continue iteration. Add the last obj whenever the iteration finished.

*/

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> intervalList = new ArrayList<>();
        
        if(intervals == null || intervals.size() == 0) {
            return intervalList;
        }
        
        intervals.sort(new IntervalAscendingOrder());
                
        Interval pre = intervals.get(0);
        for(int i = 1; i < intervals.size(); i++) {
            Interval curr = intervals.get(i);
            if(curr.start <= pre.end) {
                pre.end = Integer.max(curr.end, pre.end);
            } else {
                intervalList.add(pre);
                pre = curr;
            }
        }
        
        //due to last one need to add last one into list 
        intervalList.add(pre);
        return intervalList;
    }
}
class IntervalAscendingOrder implements Comparator<Interval> 
{ 
    // Used for sorting in ascending order of number 
    public int compare(Interval a, Interval b) 
    { 
        return a.start - b.start; 
    } 
} 
