import java.util.*;


public class DetermineIfAllCharactersOfAUnique{

	public static boolean isUnique(String str){
		Map<Character, Integer> map = new HashMap<>();

		for(int i=0; i<str.length(); i++){
			Integer k = map.put(str.charAt(i), i);
			
			if(k == null){
				System.out.println(k);
			}else{
				System.out.println(k.intValue());
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args){
		//check unique 

		System.out.println(isUnique("abbbbbbbbb"));
	}
	
}