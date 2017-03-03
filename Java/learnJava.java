//Java: 
import java.io.*;
import java.util.*;

public class learnJava extends helper{

	//instance var
	int abc = 0;


	public learnJava(){
		//local
		int a = 0;
		boolean b = true;
		char c = 'z';
	}
	
	public static void main(String[] args){
		
		//Fundamental Data Type
		int range_1 = -21437648;
		int range_2 = 21437648;

		boolean a = true;
		boolean b = false;

		char z = 'z';

		//all the variables must have a specified data type
		
		System.out.println(10%3);

		learnJava r = new learnJava();
		helper h = new helper();
		r.print(123);
		h.print(123);

		//Data Structure
			//list: import java.util.ArrayList
				ArrayList<String> list = new ArrayList<String>();
				list.add("abc");
				list.add("bca");

			//hashMap:  import java.util.HashMap;
				HashMap<String, Integer> map = new HashMap<String, Integer>();
				map.put("china", 20);
				map.put("USA", 50);

				map.get("china"); //output 20
				map.keySet(); //china

	}	

	public void print(int a){
		System.out.println("this is in learnJava class: " + a);
	}

}