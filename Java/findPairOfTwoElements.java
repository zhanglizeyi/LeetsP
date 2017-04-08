import java.util.*;

class findPairOfTwoElements{

	public int[] findTwo(int[] arr, target){
		Map<Integer, Integer> m = new HashMap<>();

		for(int i=0; i<arr.length(); i++){
			m.put(target-arr.charAt(i), arr.charAt(i)); //9-4, 4
		}

		for(int i=0; i<arr.length(); i++){
			if(m.containsKey(arr.charAt(i))){
				
			}
		}
	}


	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		findPairOfTwoElements f = new findPairOfTwoElements();
	}
}