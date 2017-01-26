/*
	解题思路： nested loop
			先sort 玩它的规律然后去loop这个vector
			得到他的下一位和最后一位，然后再加一个loop去寻找下一位和最后一位的和
			由两边来找他们的值
			
			ex: [1,0,-1,4,2,-1]
				1.[-1,-1,0,1,2,4]
				
				2. for loop
					value: -(-1)
					index next: 1
					index last: 5

				3.    next(1) < last(5)
						sum = 1+5
						if(sum < 1) next++ 2
						else if(sum > 1) last-- 4
						else{ case(curr=1, next=2, last=3)
							vector<int> v(3,0)
							v[0] = -1
							v[1] = 0
							v[2] = 1
							v.push_back(v)

							while(next < last && nums[next] == v[1]) next++;
									2 > 4 && 						
	

							while(next < last && nums[last] == v[2]) last--;
						}
				4. while(i+1 < nums.size() && nums[last] == nums[i]) i++;
*/

#include <iostream>
#include <vector>
using namespace std;

class Solution{

public:
	vector<vector<int> > threeSum(std::vector<int>& nums){
		
		vector<vector<int> > result; //return value
		//ex [-4,0,-1,2,5]
		sort(nums.begin(), nums.end());
		//[-4,-1,0,2,5]

		for(int i=0; i<nums.size(); i++){

			int curr = -nums[i]; //-4
			int next = i+1; //1
			int last = nums.size()-1; //4

			//run from begin and back both way 
			while(next < last){

				//int sum = curr + nums[next] + nums[last];\
				int sum = nums[next] + nums[last];
				if(sum < target){
					cout << "sum < 0" << endl;
					next++;
				}
				else if(sum > target){
					cout << "sum > 0" << endl;
					last--;

				}else{
					cout << "Need to store " << endl;
					vector<int> v (3,0);
					v[0] = curr;
					v[1] = nums[next];
					v[2] = nums[last];
					result.push_back(v);
				}
			}
			while(i+1 < nums.size() && nums[i+1] == nums[i]) i++;
		}
	}
};

int main(){
	Solution t;
	vector<int> v;
	v.push_back(-1);
	v.push_back(0);
	v.push_back(1);
	v.push_back(2);
	v.push_back(-1);
	v.push_back(4);

	cout << t.threeSum(v) << endl;

	return 0;
}