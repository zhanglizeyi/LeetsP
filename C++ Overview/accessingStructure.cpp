#include <iostream>
#include <cstring>
using namespace std;

struct Books
{
	/* data */
	char title[50];
	char author[50];
	char subject[100];
	int book_id;
}books;


int main(){

	struct Books book1; //declare book1 of type Books
	struct Books book2; //declare book2 of type Books


	strcpy(book1.title, "title");
	strcpy(book1.author, "Jason");
	strcpy(book1.subject, "abc");
	book1.book_id = 5;

	cout << "the book' title: " << book1.title << endl;
	cout << "the book' author: " << book1.author << endl;
	cout << "the book' subject: " << book1.subject << endl;
	cout << "the book' book_id: " << book1.book_id << endl;


	cout << "pointer is here " <<endl;
	struct Books *bp1;

	strcpy(bp1->title, "title in pointer");
	strcpy(bp1->author, "author in pointer");
	strcpy(bp1->subject, "subject in pointer");
	bp1->book_id = 10;

	cout << "the book' title: " << bp1->title << endl;
	cout << "the book' author: " << bp1->author << endl;
	cout << "the book' subject: " << bp1->subject << endl;
	cout << "the book' book_id: " << bp1->book_id << endl;	

	return 0;
}