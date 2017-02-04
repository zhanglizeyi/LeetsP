#include <iostream>
#include <vector>

using namespace std;


class Solution{

public:
	int removeDuplicates(vector<int> v){
		int count = 0;

		for(int i=1; i<v.size(); i++){
			if(v[i] == v[i-1]){
				count++;
			}else{
				v[i-count] = v[i];
			}
		}

		cout << "count: " << count <<endl;
		cout << " " << v.size() - count << endl;
		for(int i=0; i<v.size(); i++){
			cout<<"after: " << v[i] <<endl;
		}

		return 0;
	}


};


int main(){

	Solution sol;	
	vector<int> v;
	v.push_back(1);
	v.push_back(1);
	v.push_back(2);
	v.push_back(3);

	sol.removeDuplicates(v);


	return 0;
}