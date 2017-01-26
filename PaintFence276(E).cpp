#include <iostream>
using namespace std;

class Soliution{

public:
	int numWays(int n, int k){
		if(n <= 1 || k == 0) return n*k;

		int color = k, colorDiff=k*(k-1),temp=0;

		for(int i=2; i<n; i++){
			temp = (k-1)*(color+colorDiff);
			color=colorDiff;
			colorDiff=temp;
		}
		return color+colorDiff;
	}

};


int main(){



	return 0;
}