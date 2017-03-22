import java.util.*;

class validAnagram{

	public boolean isAnagram(String s, String t){
		Map<Character, Integer> m = new HashMap<>();


		for(int i=0; i<s.length(); i++){
			if(m.containsKey(s.charAt(i))){
				int value = m.get(s.charAt(i));
				System.out.println("contains key value: "+ s.charAt(i)+" :  "+ value);
				m.put(s.charAt(i), ++value);
			}else{
				m.put(s.charAt(i), 1);
			}
		}

		for(int i=0; i< t.length(); i++){

			if(m.containsKey(t.charAt(i))){
				int value = m.get(t.charAt(i));
				if(--value == 0){
					m.remove(t.charAt(i));
				}else{
					m.put(t.charAt(i), value);
				}
			}else{
				return false;
			}
		}

		if(m.isEmpty()) return true;

		return false;
	}

	public static void main(String[] args){
		validAnagram test = new validAnagram();
		String s = "anagram";
		String t = "naagram";
		System.out.println(test.isAnagram(s,t));
	}
}