import java.util.HashMap;

public class worldPattern{

	public boolean worldPattern(String pattern, String str){
		char[] myPattern = pattern.replaceAll("[^a-z^A-Z]","").toCharArray();
		String[] myArray = str.split(" ");
		boolean check = false;

		//check length
		if(pattern.length() != myArray.length){check=false;}

		//hashmap to store 
		HashMap<Character, String> myMap = new HashMap<>();

		for(int i=0; i < myPattern.length; i++){
			char c = pattern.charAt(i);
			String s = myMap.get(c);

			myMap.put(c,myArray[i]);
			
			if(s==null){
				if(myMap.containsValue(myArray[i])){
					check = false;
				}
				myMap.put(c,myArray[i]);
			}else if(!s.equals(myArray[i])){
				check = false;
			}
		}
		return check;
	}

	public static void main(String[] args){

		worldPattern myClass = new worldPattern();

		//Test case
		// String str7= "abb c";
		// String str8= "dog cat cat fish";
		// System.out.println("return -> " + myClass.worldPattern(str7, str8));
		String str1= "abba";
		String str2= "dog cat cat dog";
		System.out.println("return -> " + myClass.worldPattern(str1, str2));
		String str3= "aaaa";
		String str4= "dog cat cat dog";
		System.out.println("return -> " + myClass.worldPattern(str3, str4));
		String str5= "aaaa";
		String str6= "dog dog dog dog";
		System.out.println("return -> " + myClass.worldPattern(str5, str6));
		String str7= "abba";
		String str8= "dog cat cat fish";
		System.out.println("return -> " + myClass.worldPattern(str7, str8));
	}
}