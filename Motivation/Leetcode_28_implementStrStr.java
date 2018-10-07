/**
 * Problem: Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example:
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * 
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 *
 * Solution: Double iterations to solve this problem, outter loop handle
 * haystack and inner loop handle needle. When they have same chars then compare
 * until the counter will have the same size as needle's length.
 *
 */

class Solution {
    public int strStr(String haystack, String needle) {
        
        // return haystack.indexOf(needle);

        //size 0 check
        if(haystack.length() == 0 && needle.length() > 0) {
            return -1;
        }

        if(needle.length() == 0 && haystack.length() > 0) {
            return 0;
        }

        if(needle.length() == 0 && haystack.length() == 0) {
            return 0;
        }

        //size 1 check
        if(haystack.length() == 1) {
            if(needle.length() == 1 && needle.charAt(0) == haystack.charAt(0)) {
                return 0;
            } else {
                return -1;
            }
        }

        int count = 0;
        for(int i=0; i<haystack.length(); i++) {
            for(int j=0; j<needle.length(); j++) {
                if(i+j > haystack.length()-1) {
                    //can not find it
                    return -1;
                }
                if(haystack.charAt(i+j) == needle.charAt(j)) {
                    //pairing
                    count++;
                }
            }
            //check
            if(count == needle.length()) {
                return i;
            } else {
                count = 0;
            }
        }

        return -1;
    }
}
 


