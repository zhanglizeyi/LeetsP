import java.util.*;


public class BinarySearch{

	//two way to do it, iteration and recursion 

	//1. iteration to search 

	public static int binarysearch(int[] arr, int target){
		int middle = arr.length/2;
		int l = 0;
		int r = arr.length;

		while(true){
			if(target == arr[middle]){
				return middle;
			}else if(target < arr[middle]){
				middle /= 2;
			}else if(target > arr[middle]){
				middle = (middle + arr.length)/2;
			}else{
				System.out.println("no element in the array");
				break; 
			}
		}
		return middle;
	}



	public static void BinarySearchRecursive(int[] arr, int target, int l, int r){
		if(l > r) return;
		if(target == arr[(l+r)/2]) System.out.println("found");
		BinarySearchRecursive(arr, target, 0, (l+r)/2);
		BinarySearchRecursive(arr, target, (l+r)/2+1, r);
	}	


	public static void quickSort(int[] arr, int l, int r){
		if(l >= r) return;

		int middle = arr[(l+r)/2]; 
		int ind = partition(arr, l, middle, r);

		quickSort(arr, ind, r);
		quickSort(arr, l, ind-1);
		
	}


	public static int partition(int[] arr, int l, int p, int r){
		System.out.println( "  ");
		while(l <= r){
			while(arr[l] < p) l++;
			while(arr[r] > p) r--;


			if(l <= r){
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;
			}
		}

		for(int i=0; i<arr.length; i++){
			System.out.print( "  " + arr[i]);
		}

		return l;
	}


	public static void main(String[] args){
		int[] test = {4, 5, 6, 7, 51, 11, 50, 0, 1, 2, 3};

		
		quickSort(test, 0, test.length-1);
		// System.out.println("   "+binarysearch(test, 7));
		BinarySearchRecursive(test, 7, 0, test.length-1);
	}
}