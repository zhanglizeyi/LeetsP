class Solution {
public:
    int arrangeCoins(int n) {
        
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        int temp = n;
        int res = 0;
        for(int i = 0; i < n; i++){
            res = temp - i;
            
            if(res < 0) return i-1; //return digit before
            else if( res == 0) return i; //return one
            
            temp = res; //update
        }
        return res;
    }
};
