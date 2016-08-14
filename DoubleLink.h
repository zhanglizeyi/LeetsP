#ifndef DOUBLE_LINK_HPP
#define DOUBLE_LINK_HPP

#include <iostream>
using namespace std;

template<class T> struct Dnode
{
	/* data */
public: 
	T value;
	Dnode *prev;
	Dnode *next;

public: 
	Dnode(){}
	Dnode(T t, Dnode *prev, Dnode *next){
		this->value = t;
		this->prev = prev;
		this->next = next;
	}

};

template<class T> class DoubleLink
{
	public: 
		DoubleLink();
		~DoubleLink();    //delete all whenever finish 

		int size();
		int is_empty();

		T get(int index); //get whatever the index value
		T get_first(); //find first node 
		T get_last();	//find last node 

		int insert(int index, T t); //insert new node 
		int insert_first(T t);
		int append_last(T t);

		int del(int index);
		int del_first();
		int del_last();

	private:
		int count;
		Dnode<T> *phead;
	private:
		Dnode<T> *get_node(int index);

};

template<class T> DoubleLink<T>::DoubleLink() : count(0){
	//create a new node for head, since head is empty node 
	phead = new Dnode<T>();
	phead->prev = phead->next = phead;
	//set the up the link with count = 0
}

//
template<class T> DoubleLink<T>::~DoubleLink()
{
	//del all node 
	Dnode<T> * ptmp;
	Dnode<T> * pnode = phead->next;

	//delete all the node 
	while(pnode != phead){
		ptmp = pnode;
		pnode = pnode->next;
		delete ptmp;
	}

	delete phead; //delete one node at each node
	phead = NULL;
}

//size of linklist
template<class T> int DoubleLink<T>::size(){
	return count;
}

//return linked list check empty or not 
template<class T> int DoubleLink<T>::is_empty()
{
	return count == 0;
};

//get the index th from nodes
template<class T> Dnode<T> * DoubleLink<T>::get_node(int index)
{
	//Check it is a vaild index
	if(index < 0 || index >= count ){
		cout << "out of bound" << endl;
		return NULL;
	}

	//-> finding 
	if(index <= count/2){
		int i=0;
		Dnode<T> * pindex = phead->next;
		while(i++ < index){
			pindex = pindex->next;
		}
		return pindex;
	}


	// <- finding reverse 
	int j = 0;
	int rindex = count - index - 1;

	Dnode<T> * prindex = phead->prev;

	while( j++ < rindex ){
		prindex = prindex->prev;
	}
	return prindex;
}

//get nth index position node value
template<class T> T DoubleLink<T>::get(int index)
{
	return get_node(index)->value;
}

//get first node 
template<class T> T DoubleLink<T>::get_first()
{
	return get_node(0)->value;
}

//get last node 
template<class T> T DoubleLink<T>::get_last()
{
	return get_node(count-1)->value;
}


//insert nth index position 
template<class T> int DoubleLink<T>::insert(int index, T t)
{
	if( index == 0 ){
		return insert_first(t); 
	}

	Dnode<T> * prindex = get_node(index);
	Dnode<T> * pnode = new Dnode<T>(t, prindex->prev, prindex);
	prindex->prev->next = pnode;
	prindex->prev = pnode;
	count++;

	return 0;
}


//insert first 
template<class T>int DoubleLink<T>::insert_first(T t)
{
	/* data */
	Dnode<T>* pnode = new Dnode<T>(t, phead, phead->next);
	phead->next->prev = pnode;
	phead->next = pnode;
	count++;

	return 0;
}

//insert last 
template<class T>int DoubleLink<T>::append_last(T t)
{
	Dnode<T> * pnode = new Dnode<T>(t, phead->prev, phead);
	phead->prev->next = pnode;
	phead->prev = pnode;
	count++;

	return 0;
} 


//delete index position node 
template<class T>int DoubleLink<T>::del(int index)
{
	Dnode<T> * pindex = get_node(index);
	pindex->next->prev = pindex->prev;
	pindex->prev->next = pindex->next;
	count--;
	delete pindex;

	return 0;
}

//delete first node
template<class T>int DoubleLink<T>::del_first(){

	count--;
	return del(0);
}

//delete last node 
template<class T> int DoubleLink<T>::del_last()
{
	count--;
	return del(count-1);
}


#endif




