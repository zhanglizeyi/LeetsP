/**
 * Problem: Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 *
 * Your algorithm should run in O(n) complexity.
 *
 * Example:
 *
 * Input: [100, 4, 200, 1, 3, 2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 *
 * Solution: Create a set and loop low bound and high bond to find the difference.
 */

public class NumerOfLongestConsecutive {

    public static int solution(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums) {
            set.add(num);
        }

        int max = 0;
        for(int num : nums) {
            if(set.contains(num)) {
                set.remove(num);

                int low = num - 1;
                int high = num + 1;

                while(set.contains(low)) {
                    set.remove(low);
                    low--;
                }

                while(set.contains(high)) {
                    set.remove(high);
                    high++;
                }

                max = Integer.max(max, high - low - 1);
            }
        }

        return max;
    }
}

