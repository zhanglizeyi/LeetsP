import java.util.*;


public class validPerfectSquare367E{

	
	public static boolean Solution(int i){

		long t = i; //don't know the size so 64bit
		while(t*t > i){
			System.out.println("t: " + t + " number: "+ i);
			t = (t + i/t) / 2;
			System.out.println("num: " + t );
		}

		return t*t == i;
	}

	public static void main(String[] args){

		System.out.println(Solution(81));
	}
}