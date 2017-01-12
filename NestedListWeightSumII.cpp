/*
	解题思路:
		DFS去求解，找每一次的深度，但是不同的是相反，深度越深则相乘list的最浅的深度
		深度越浅 则相乘list的越深深度。
		
		需要建立两个变量，初始化为0，如果nestedList不为空，循环 
		声明一个空数组， nextLevel, traversal nestedList 里所有的
		元素， 如果数字， 非权限加这个数字， 如果是数组，就加入进去nextLevel
		这样第一层的数字和保存在非权重了，之后的元素就存入了nextLevel， 
		然后把unweighted 加入 weighted， 把nextlevel 赋值给nestedList,
		然后在进入下一层的计算，由于上一层还在unweighted里，所以第二层计算，
		相当于第一层数字和被加了两次。	
*/

class Solution {
public:
    int depthSumInverse(vector<NestedInteger>& nestedList) {
       int sum = 0;
       
       int unweighted = 0 , weighted = 0;

       while(!nestedList.empty()){
       		//new vector to save next level vars
       		vector<NestedInteger> nextLevel;

       		for( auto list : nestedList){
       			if(list.isInteger())
       			{
       				unweighted += list.getInteger();
       			}
       			else
       			{
       				nextLevel.insert(nextLevel.end(), list.getList().begin(), list.getList().end());
       			}
       		}
       		weighted += unweighted;
       		nestedList = nextLevel; 
       }

       return weighted;
    }

}；