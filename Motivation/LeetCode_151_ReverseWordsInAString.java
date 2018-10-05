/**
Problem: Given an input string, reverse the string word by word.

Example: 
Input: "the sky is blue",
Output: "blue is sky the".


Soultion: trim the string and split string into string array. Iterating the string array and swap the
ymmetrical pair in the string array. And, return the new string join white space in each of the string.

*/

public class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        String[] strs = s.trim().split(" +");
        String ret="";
        
        int i=0, j=strs.length-1;
        String temp="";
        while(i < j) {
            temp = strs[i];
            strs[i] = strs[j];
            strs[j] = temp;
            i++;
            j--;
        }
        
        return ret.join(" ",strs);
    }
}
