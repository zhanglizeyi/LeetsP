/*解题思路
	
	这里面是需要跑一次， 跑一个loop，O(n)
	然后最大的地方就是， 一个转换，把每一个emlement 放进去一个暂时的variable
	然后加上notRob就会得到暂时的rob的值，然后build-in function max去赋值给
	notRod但是，在第一次跑的时候，notRod永远是0， 而rob被updata，然后notRod
	会update by each run of diff value, rob只会拿到现在index value 加上
	notRod值。
*/
//declare a max method or can include <cmath>
//#define max(a,b) (a >= b)? a : b;

#include <cmath>
#include <iostream>
#include <vector>
using namespace std;


class Solution{

public:
	int rob(vector<int> & nums){

		//ex [2,1,1,2]

		int rob=0, notRob=0;
		for(int i=0; i<nums.size(); i++){
		
			int currRob = nums[i] + notRob;
			notRob = max(rob, notRob);
			rob = currRob;
		
		}

		return max(rob, notRob);
	}
};

int main(){

	Solution s;
	vector<int> v;
	int arr[] = {2,2,2,2};
	v.insert(v.begin(), arr, arr+4);
	cout << "The most of value: " <<s.rob(v) << endl;

	return 0;
}