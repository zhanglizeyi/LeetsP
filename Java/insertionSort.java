import java.util.*;

/*
	Time complexity:
		best: O(n)

		ave: O(n^2)

		worst: O(n^2)
*/

public class insertionSort{

	public void insertSort(int[] arr){
		//17 5 3 25 7

		//out loop will go each step through all elements of array
		//inner loop read each further elements and insert and sort

		for(int i=1; i<arr.length; i++){
			//first position is fixed
			int j = i; //pass to where it start

			while(j>0 && arr[j] < arr[j-1]){
				int swap = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = swap;

				j -= 1; //decrase
			}
		}
	}

	public static void main(String[] args){
		int[] arr = {17, 5, 3, 25, 7};

		insertionSort test = new insertionSort();
		test.insertSort(arr);

		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);	
		}
		
	}
}