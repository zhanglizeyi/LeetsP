import java.util.*;


/*
	time complexity: O(n log n)
	space complexity: O(n)
*/

public class isPermutationOfTwoStrings{

	public static boolean isPermutation(String s1, String s2){
		
		if(s1.length() != s2.length()) return false;

		Map<Character, Integer> m1 = new LinkedHashMap<>();
		Map<Character, Integer> m2 = new LinkedHashMap<>();
		
		for(int i=0; i<s1.length(); i++){
			m1.put(s1.charAt(i), i);
			m2.put(s2.charAt(i), i);
		}

		if(m1.size() != m2.size()) return false;

		for(Map.Entry<Character, Integer> entry : m1.entrySet()){
			if(m2.containsKey(entry.getKey())){
				if(entry.getValue() != m2.get(entry.getKey()))
					return false;


			}

			
		}	

		return true;
	}


	public static void main(String[] args){

		String s1 = "asdklfjl";
		String s2 = "asdkljflk";
		System.out.println(isPermutation(s1, s2));

		String s3 = "abcde";
		String s4 = "abcde";
		System.out.println(isPermutation(s3, s4));
	}
}