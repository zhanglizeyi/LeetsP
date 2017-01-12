/*
	add(1); add(3); add(5);
	find(4) -> true
	find(7) -> false


	解题思路：
		这道题运用了add和find，从他想要的结果很容易推断出
		用map或者unordered_map 最好， 因为单独搜索O(1)，
		相同的input，可以给它们多次记录，在running time上
		就可以节省了很多时间。
	
		一开始的map会在处理大数据的时候卡掉，但不应该如此，
		map是internal tree structure, 而unordered_map不是，
		尤其要找大数据的时候，unoreded_map是O(n)， 而map应该是
		（log n）in iteration...working on it
*/

class TwoSum {
private:
	//declare a unordered map in privte 
	unordered_map<int, int> m;

public:
	void add(int number){
		//every input number as key, and make value++
		//that can track how many input of same one
		m[number]++;
	}

	bool find(int value){

		unordered_map<int,int>::iteration it = m.begin();

		for(it; it != m.end(); ++it){
			int i = it->first;
			int j = value - i;
			/*
				Check if i 和 j 的值是一样，那就要同时看它们的input
				有没有1个以上 才能确保它有2个以上可以pair sum,
				otherwise, i 和 j 不相等的时候，我们就用buildIn find
				(j). value - it->first = any value in table, if 
				find function can find that value in table, then true
				else false.
			*/
			if((i==j && it->second > 1) || (i != j && m.find(j) != m.end()))
				return true;
		}

		return false;
	}

};
