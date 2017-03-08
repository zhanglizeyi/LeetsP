import java.util.Random;

public class quickSort{

	//best O(n)
	//ave O(nlog(n))
	//worst O(n^2)


	public static int rand(int a, int arrSize){
		int rand = (int)(Math.random()*(a));
		
		while(rand > arrSize){
			rand = (int)(Math.random()*(a));
		}

		return rand;
	}

	//[2,6,43,5,1,7]
	//partioning
	public static void qSort(int[] arr, int left, int right){
		if(left >= right) return;
		int piovt  = arr[rand(left+right, arr.length-1)];
		//System.out.println("random: " + rand +" i: "+ i); 
		int ind = partion(arr, left, right, piovt);
		qSort(arr, ind, right);
		qSort(arr, left, ind-1);
	}

	public static int partion(int[] arr, int l, int r, int p){
		while(l <= r){
			while(arr[l] < p) l++;
			while(arr[r] > p) r--;

			if(l <= r){
				int temp = arr[r];
				arr[r] = arr[l];
				arr[l] = temp; 
				l++;
				r--;
			}
		}
		return l;
	}


	public static boolean isSorted(int[] arr){

		for(int i=0; i<arr.length-1; i++){
			if(arr[i] > arr[i+1]){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){

		int[] arry = {2, 5, 53, 5, 1, 9, 12, 123, 4, 1 ,0};

		qSort(arry, 0, arry.length-1);

		for(int i=0; i<arry.length; i++){
			System.out.println(arry[i]);	
		}
		
		System.out.println("size : " + arry.length);
		if(isSorted(arry)) System.out.println("The array is in increasing and sorted by QuickSort!");
		
	}  	

}