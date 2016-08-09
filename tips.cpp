#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    double mealCost = 12.00;
    int tipPercent = 20, taxPercent = 8;
    cin >> mealCost;
    cin >> tipPercent;
    cin >> taxPercent;

    
    //calculation
    double tip = mealCost * ((double)tipPercent/100);
    cout << tip <<endl;
    double tax = mealCost * ((double)taxPercent/100);
    cout << tax <<endl;
    double totalCost = mealCost + tip + tax;
    cout << totalCost <<endl;
    
    cout << "The total meal cost is "<<totalCost<< " dollars." <<endl;
    

    if( (n % 2) != 0)
    {
        cout<< "Weird";
    }
    else if( n >= 2 and n <= 5)
    {
        cout << "Not Weird";
    }
    else if( n >= 6 and n <= 20)
    {
        cout << "Weird";
    }
    else
    {
        cout << "Not Weird";
    }

    return 0;
}

