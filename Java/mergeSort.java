import java.util.*;


//O(n log(n)) 
//space complexity neeed more 


public class mergeSort{

	public static void mergesort(int[] arr, int[] temp, int left, int right){
		if(left >= right) return; //nothing to do it

		int half = (right + left)/2; 
		mergesort(arr, temp, left, half);
		mergesort(arr,temp, half+1, right);
		//helper func 
		mergeBack(arr, temp, left, half+1, right);
	}

	public static void mergeBack(int[] arr, int[] temp, int left, int center, int right){

		int leftEnd = center - 1; //for left half 
		int start = left; // for new temp array to use
		int size = right - left + 1;

		while(left <= leftEnd && center <= right){
            if(arr[left] <= arr[center])
                temp[start++] = arr[left++];
            else
                temp[start++] = arr[center++];
        }

        while(left <= leftEnd)    // Copy rest of first half
            temp[start++] = arr[left++];

        while(center <= right)  // Copy rest of right half
            temp[start++] = arr[center++];

        for(int i = 0; i < size; i++, right--)
            arr[right] = temp[right];

		//return temp;
	}

	public static void main(String[] args){

		int[] test = {1, 5, 2, 3, 7, 9, 10, 0 ,8};
		//mergeSort(test);
		mergesort(test, new int[test.length], 0, test.length-1);

		int[] test2 = {2, 1, 3};
		//test2 = merge(test2, new int[test2.length], 0, 1, 2);

		for(int i=0; i<test.length; i++){
			System.out.println(test[i]);
		}
	}
}

