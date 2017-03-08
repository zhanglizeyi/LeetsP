import java.util.*;


/*
	Time complexity:
		best: O(n^2)
		ave: O(n^2)
		worst: O(n^2)

*/

public class selectionSort{

	//ex:
	// 3 5 6 10 1 28 2
	// 3 5 6 10 1 2 28
	// 3 5 6 2 1 10 28
	// 3 5 1 2 6 10 28
	// 3 2 1 5 6 10 28
	// 1 2 3 5 6 10 28


	public void selectSort(int[] arr){

		//loop from backward
		for(int i = arr.length-1; i >= 0; i--){
			int temp = 0;
			//find largest 
			for(int j=0; j<=i; j++){
				if(arr[temp] < arr[j]) temp = j; //< , > could reverse the order
			}
			//find the biggest and put into sort area, last 
			int swap = arr[temp]; //large
			arr[temp] = arr[i]; //swap
			arr[i] = swap; // put on last  
		}

	}

	public static void main(String[] args){
		int[] arr = {3, 5, 6, 10, 1, 28 ,2};
		
		selectionSort s = new selectionSort();
		s.selectSort(arr);

		for(int i = 0; i<arr.length; i++){
			System.out.println("elems: "+ arr[i]);
		}
	}
}