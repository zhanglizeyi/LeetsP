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
int lonelyinteger(vector < int > a, int lit) {
    //the number can not bigger than lit
    //find the biggest unique non-repeatted elements
    int retVal = 0; 
    if(a.size() == 1) return a.at(0);
    int arr[a.size()];
    int count = 0;
    
    for(int j=0; j<a.size(); j++){
        for(int i=j; i<a.size(); i++){
            if(a.at(j) == a.at(i)){
                count = 1;
            }
            //if(retVal <= a.at(i))
             //   retVal = a.at(i);
        }
        //if(count >= 1){
            arr[j] = a.at(j);
            cout << arr[j] << " ";
        //}
        count =0;
    }
    cout<< endl;
    
return retVal;

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
    
    res = lonelyinteger(_a, _a_item);
    cout << res;
    
    return 0;
}
