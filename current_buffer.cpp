#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;


int main(){
    int x1;
    int v1;
    int x2;
    int v2;
    
    string result ="";
    cin >> x1 >> v1 >> x2 >> v2;
    int vv1, vv2;

   if( x1 >= 0 && x2 > x1 && x2 <= 10000)
   {    
       while( vv1 <= 10000 || vv2 <= 10000 )
       {
           if(x1 == x2)
           {
                cout << "YES" << endl;
                return 0;
           }

           x1 = x1 + v1;
           x2 = x2 + v2;
           vv1++;
           vv2++;
       }
       result = "NO";
   }
   else
   {
       result = "NO";
   }
    
    cout << result << endl;
    
    return 0;
}
