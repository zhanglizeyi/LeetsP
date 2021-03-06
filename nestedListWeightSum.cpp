/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * class NestedInteger {
 *   public:
 *     // Return true if this NestedInteger holds a single integer, rather than a nested list.
 *     bool isInteger() const;
 *
 *     // Return the single integer that this NestedInteger holds, if it holds a single integer
 *     // The result is undefined if this NestedInteger holds a nested list
 *     int getInteger() const;
 *
 *     // Return the nested list that this NestedInteger holds, if it holds a nested list
 *     // The result is undefined if this NestedInteger holds a single integer
 *     const vector<NestedInteger> &getList() const;
 * };
 */

#include <iostream>
#include <string>

using namespace std;

class Solution {
public:
    int depthSum(vector<NestedInteger>& nestedList) {
        return helpDepthSum(nestedList, 1);   
    }

    /*
		建立一个helper method然后放进去 const linked list
    */


    int helpDepthSum(const vector<NestedInteger>& nest, int dep){
    	int sum = 0;

    	for(const auto& list : nest){
	    	
	    	if(nest.isInteger()){
	    	
	    		sum += nest.getInteger() * dep;
	    	}
	    	else 
	    	{
	    		sum += helpDepthSum(list.getList(), dep+1);
	    	}
	    }

	    return sum;
    }

};


