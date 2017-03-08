// package hw4;

import java.util.*;

public class Stack12<E> implements BoundedStack<E> {

 	private LinkedList<E> myList;

	public int capacity(){
		return 0;
	}

	public int size(){

		return myList.size();
	}

	public boolean push(E e){
		//push it into list at the begaining of the list
		return false;
	}

	public E pop(){
		//pop it from last of 
		return (E) null;
	}

  	public E peek(){
  		return (E) null;
  	}

	public static void main(String[] args){

	}

}