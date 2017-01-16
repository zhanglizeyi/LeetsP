#include <iostream>
#include <ctime>
using namespace std;


// struct tm {

// 	int tm_sec; //seconds of minutes from 0 to 61
// 	int tm_min; //minutes of hour from 0 to 59
// 	int tm_hour; //hours of day from 0 to 24
// 	int tm_mday; //day of month from 1 to 31
// 	int tm_mom; //month of year from 0 to 11
// 	int tm_year; //year since 1900
// 	int tm_wday; //days since sunday
// 	int tm_yday; //days since January 1st
// 	int tm_isdst; //hours of daylight savings time
// };

int timeStruct(){

	//current date/time based on current system
	time_t now = time(0);

	cout << "Number of sec since January 1, 1970: " << now << endl;

	tm *ltm = localtime(&now);

	cout << "Year" << 1900 + ltm->tm_year << endl;
	cout << "Month" << 1 + ltm->tm_mon << endl;

	return 0;
}

int main(){

	//current date/time based on current system
	time_t now = time(0);

	//convert now to string
	char* dt = ctime(&now);

	cout << "The local date and time is: " << dt << endl;

	//convert now to tm struct for UTC
	tm *gmtm = gmtime(&now);
	dt = asctime(gmtm);
	cout << "The UTC date and time is: " << dt <<endl;


	cout << "This is time struct: " << endl;
	timeStruct();

	return 0;
}