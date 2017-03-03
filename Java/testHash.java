import java.util.*;


public class testHash{

	// public HashMap<Integer, Student> buildMap(Student[] students){
	// 	HashMap<Integer, Student> map = new HashMap<Integer, Student>();
	// 	for(Student s: students){
	// 		map.put(s.getId(), s);
	// 	}

	// 	return map;
	// }

	public static void main(String[] args){
		HashMap<Integer, String> map = new HashMap<Integer,String>();

		map.put(0, "abc");
		map.put(1, "cba");
		map.put(2, "bca");

		for(Map.Entry entry: map.entrySet()){
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}	
	}
}

