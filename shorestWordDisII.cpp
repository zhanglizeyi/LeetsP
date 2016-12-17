#include <iostream>
#include <vector>
#include <string>
#include <map>

using namespace std;

class WordDistance {
map<string, vector<int>> map;
public:
    WordDistance(vector<string>& words) {
        int size = words.size();
        
        for(int i=0; i < size; i++)
        {
            map[words[i]].push_back(i);
        }
        
    }
    
    int shortest(string word1, string word2) {
        vector<string> vec1 = map[word1];
        vector<string> vec2 = map[word2];
        int ret = INT_MAX; 
        int temp = 0;
        int i, j = 0;
        
        while(i < vec1.size() && j < vec2.size())
        {
            temp = vec1[i] > vec2[j] ? vec2[j] : vec1[i];
        }
        
        return temp;
    }
};

int main() {
    string myint[] = {"abc", "asdfas", "asdfasd", "asdfasdfasdfa"};
    vector<string> mp (myint);

    WordDistance d(&mp);


    return 0;
}

