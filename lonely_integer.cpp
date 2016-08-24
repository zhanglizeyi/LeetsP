#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <cstdlib>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
using namespace std;
int lonelyinteger(vector < int > a) {
    //the number can not bigger than lit
    //find the biggest unique non-repeatted elements
    int retVal = 0; 
    int arr[1000000];
    if(a.size() == 1) return a.at(0);
    
    for(int i=0; i<a.size(); i++)
    {
        arr[a.at(i)]++; //count method
        cout << "a.at(i) " << a.at(i) << " arr " << arr[a.at(i)] << endl;     
        if(a.at(i) > retVal) retVal = a.at(i);
        cout << "retVal: " << retVal << endl;
    }

    //count in there position to get repeatation, if true ++
    //in the meanwhile, retVal take a largest in the vector
    

cout << "==========================================" <<endl;
    int mx = -1;
    for(int i=0; i<=retVal; i++)
    {
        if(arr[i] == 1) mx = i;
        //if not equal return the pervious store
    }


return mx;

}
int main() {
    int res;
    
    int _a_size;
    cin >> _a_size;
    cin.ignore (std::numeric_limits<std::streamsize>::max(), '\n'); 
    vector<int> _a;
    int _a_item;
    for(int _a_i=0; _a_i<_a_size; _a_i++) {
        cin >> _a_item;
        _a.push_back(_a_item);
    }
    
    res = lonelyinteger(_a);
    cout << res;
    
    return 0;
}
