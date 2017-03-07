import java.util.*;


public class Deque12<E> implements BoundedDeque<E>{

	private int cap = 8;
	protected int[] arry;
	protected int front;
	protected int rear;	

	public Deque12(){
		arry = new int[cap];
		cap = capacity();
		front=rear=0;
	}

	public int capacity(){
		return cap;
	}

  	public int size(){
  		return rear-front;
  	}

  	public boolean addFront(E e){

  		for(int i=0; i<arry.length; i++){

  		}

  		return false;
  	}

  	public boolean addBack(E e){
  		return false;
  	}

  	public E removeFront(){
  		return (E) null;
  	}

  	public E removeBack(){
  		return (E) null;
  	}

  	public E peekFront(){
  		return (E) null;
  	}

  	public E peekBack(){
  		return (E) null;
  	}


}