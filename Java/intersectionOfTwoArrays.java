import java.util.*;

class intersectionOfTwoArrays{

	public int[] inserctionTwoArrays(int[] arr1, int[] arr2){
		Set<Integer> m1 = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<>();

		for(int i=0; i<arr1.length; i++){
			m1.add(arr1[i]);
		}
		for(int i=0; i<arr2.length; i++){
			if(m1.contains(arr2[i])){
				list.add(arr2[i]);
				m1.remove(arr2[i]);
			}
		}
		int[] n = new int[list.size()];
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
			n[i] = list.get(i).intValue();
		}
		return n;
	}



	public static void main(String[] args){
		intersectionOfTwoArrays test = new intersectionOfTwoArrays();
		int[] arr1 = {1, 2, 3 ,2, 1};
		int[] arr2 = {2, 2, 4, 3};



		test.inserctionTwoArrays(arr1, arr2);
	}
}