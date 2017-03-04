import java.util.*;
import java.io.*;

public class Dog {

	//Instance vars
	String breed;
	int ageC;
	int puppyAge;
	String color;

	//behaviors class methods
	void barking(String level){
		System.out.println(level);
	}
	void hungry(){}
	void sleeping(){}


	public void setAge(int age){
		puppyAge = age;
	}

	public int getAge(){
		return puppyAge;
	}


	public Dog(){
		//first constructor
	}

	public Dog(String abc){
		//second constructor
	}

	public static void main(String[] args){

	}

}