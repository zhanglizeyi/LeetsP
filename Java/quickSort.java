import java.util.*;

public class quickSort{

	//best O(n)
	//ave O(nlog(n))
	//worst O(n^2)

	//[2,6,43,5,1,7]
	//partioning
	public static void qSort(int[] arr, int left, int right){
		if(left >= right) return;
		int piovt  = arr[(left+right)/2];
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

	public static void main(String[] args){

		int[] arry = {2,5,53,5,1,9};

		qSort(arry, 0, arry.length-1);

		for(int i=0; i<arry.length; i++){
			System.out.println(arry[i]);	
		}
		
	}  	

}