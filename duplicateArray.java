import java.util.*;

class duplicateArray{

	public static void main(String[] args){

		int[] numbers = {1, 3, 5, 5, 5, 5, 10, 10, 10};
		int[] temp = new int[numbers.length];

		for(int i=1; i<numbers.length; i++){
			for(int j=numbers.length-1; j > i; j--){
				if(numbers[i] == numbers[j]){
					System.out.println( numbers[j]);
					i = j;
				}
			}
		}

	}
}


