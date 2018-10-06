/**
Problem: 
	In a row of seats, 1 represents a person sitting in that seat, and 0 represents that the seat is empty. 

There is at least one empty seat, and at least one person sitting.

Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized. 

Return that maximum distance to closest person.

Solution: Created array list to save the index for the taken place, and need to consider three conditions when 1 is at the beginning position should return the original length - 1,if 1 is at last of the position should return itself and find max between them, then iterate list array to check if any adjacent pair divided by 2. Find max number of them.
*/

class Solution {
    public int maxDistToClosest(int[] seats) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<seats.length; i++) {
            if(seats[i] == 1) {
                list.add(i);
            }
        }
        
        int ret=0;
        int left = list.get(0);
        int right = seats.length-1-list.get(list.size()-1);
        ret = Math.max(left,right);
        for(int i=1; i<list.size(); i++){
            ret = Math.max(ret, (list.get(i)-list.get(i-1))/2);
        }
        
        return ret;
    }
}
