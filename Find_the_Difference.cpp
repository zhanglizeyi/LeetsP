/*
	Find the Difference
	
	Given two strings s and t which consist of only lowercase letters.
	String t is generated by random shuffling string s and then add one more letter at a random position.
	Find the letter that was added in t.

	Input:
		s = "abcd"
		t = "abcde"
	Output:
		e
	Explanation:
		'e' is the letter that was added.
*/
#include <iostream>
#include <string>

using namespace std;

class Solution{

public:
	char findTheDifference(string s, string t){
		char res = 0;

		for(int i=0; i<s.size(); i++){
			res^=(s[i] ^ t[i]);
		}

		return (res ^ t[s.size()]);	
	}
};


int main(){
	string s = "abcd";
	string t = "abcde";

	findTheDifference(s,t);

	return 0; 
}