import java.util.*;

class removeDuplicate{


	public static void removeDup(String s){
		Set<Character> set = new LinkedHashSet();
		Map<Character, Integer>  m = new HashMap<>();

		for(int i=0; i<s.length(); i++){
			m.put(s.charAt(i), i);
		}

		for(Map.Entry<Character, Integer> entry : m.entrySet()){

			System.out.println("key: " + entry.getKey() +" values: "+ entry.getValue());
		}

	}

	public static void main(String[] args){
		removeDup("aaaabbbsssfsdf");
	}
}