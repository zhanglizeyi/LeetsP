#include <iostream>
#include <set>

using namespace std;


int main(){

	set<char> res;
	string s = "abcdasdfsad";
	string s2;
	int j=1;


	for(int i=0; i<s.size(); i++){
		res.insert(s[i]);
	}

	//cout << "res: " << res <<endl;
	set<char>::iterator it = res.begin();

	for(it; it != res.end(); ++it){
		cout<< " val: " << *it <<endl;
	}

	return 0;
}