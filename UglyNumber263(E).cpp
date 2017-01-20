#include <iostream>

using namespace std;


class Solution{

public:
	bool isUgly(int num){
		//postive number
		if(num <= 0) return false;
		if(num == 1) return true;

		// while(num >= 2 && num % 2 == 0) num /= 2;
		// while(num >= 3 && num % 3 == 0) num /= 3;
		// while(num >= 5 && num % 5 == 0) num /= 5;

		//4 is not gonna hurt 
		for(int i=2; i<=5; ++i){
			while((num % i)==0){
				num /= i;
			}
		}

		return num == 1;
	}
};
