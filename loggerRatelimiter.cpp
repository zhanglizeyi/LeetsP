#include <iostream>
#include <map>
#include <string>
#include <unordered_map>

using namespace std;

class Logger{

private:
	unordered_map<string, int> map;	

public: 
	int limiter = 10;

	Logger() {

	}

	//例子： 
		/*
			我们需要hashMap 去存储message as keys
			然后每次按照key 去找里面的值
			如果时间值小于map里的value 就return false
			otherwise -> 时间加10存进去，以这个数字为基准去check
		*/ 

	bool shouldPrintMessage(int timestamp，string message){
		//时间少于hash_map里面的var， false
		if(timestamp < map[message]) return false;
		
		//map里面的value 会按照他们排列
		map[message] = timestamp + 10; 
		return true;
	}
};

int main(){


	return 0;

}