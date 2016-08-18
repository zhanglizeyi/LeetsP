#include <iostream>
#include <vector>
#include <string>
#include <sstream>
#include <map>
#include <unordered_map>
using namespace std;



bool wordPattern(string a, string b)
{
	//get length normaly two string 
	//split them and solve

//create a char with string length
	char carr[a.size()]; 
	strcpy(carr, a.c_str());

//convert string b and split it with no space
	int k = 0;
	string word;
	string sArr[1024];
	istringstream stm(b);

	int count = 0;
	while(stm >> word)
	{
		sArr[k++] = word;
		count++;
	}


	int total = a.size() + count;
	string myArray[100];

	int k1 = 0; 
	int k2 = 1;

	for(int i = 0; i < total; i++){
		myArray[k1] = carr[i];
		myArray[k2] = sArr[i];
		k1 = k1+2;
		k2 = k2+2;
	}

	for(int i = 0; i < total; i++)
	{
		//cout << myArray[i] << " " << endl; 
	}

	//check length for first string and second string
	if(k != a.size()) return false; 

	int c1 = 0;
	int c2 = 1;
	for(int i = 0; i < a.size(); i++)
	{
		stringstream ss;
		string s; 
		ss << carr[i];
		ss >> s;

		if(myArray[c1] != s)
		{
			cout << myArray[c1] << " " << s << endl;	
			return false;
		}
		
		if(myArray[c2] != sArr[i])
		{
			cout << myArray[c2] << " " << sArr[i] << endl;
			return false;
		}
		c1 = c1+2;
		c2 = c2+2;
	}

    // unordered_map<char,string> map;  
    // unordered_map<string,char> map2;  
    // vector<string> vec;  
    // int j=0;  
    // for(int i=0;i<str.size();i++){  
    //     if(str[i]==' '){  
    //         string tmp =str.substr(j,i-j);  
    //         vec.push_back(tmp);  
    //         j=i+1;  
    //     }  
    //     if(i==str.size()-1){  
    //         string tmp =str.substr(j,i-j+1);  
    //         vec.push_back(tmp);  
    //     }  
  
    // }  
    // if(pattern.size()!=vec.size())return false;  
    // for(int i=0;i<pattern.size();i++){  
    //     if(map.find(pattern[i])==map.end()&&map2.find(vec[i])==map2.end()){  
    //         map.insert(make_pair(pattern[i],vec[i]));  
    //         map2.insert(make_pair(vec[i],pattern[i]));  
    //     }  
    //     else if(map[pattern[i]]!=vec[i]||map2[vec[i]]!=pattern[i])return false;  
  
    // }  
  
    return true;  
}




int main(){

	//input abba, dog cat cat dog -> true
	//abbkqq, dog cat cat fish ok ok ->true


	cout << wordPattern("abbab", "dog cat cat dog c");




	return 0;
}