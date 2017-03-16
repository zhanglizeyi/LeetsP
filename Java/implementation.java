import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;

class implementation{

	public void list(){
		List<Integer> l = new LinkedList<>();

	}

	public void scanner(){
		Scanner in = new Scanner(System.in);
	}

	public void Queue(){
		Queue q = new LinkedList();
	}

	public void Stack(){
		Stack s = new Stack();
	}

	public void HashMap(){
		Map<Character, Integer> m = new HashMap<>();

		//case 1
		for(Character c : m.keySet()){
			System.out.println(m.getKey() + " " + m.getKey(c));
		}

		//case 2 
		for(Map.Entry<Character,Integer> entry : m.entrySet()){
			System.out.println("entry: " + entry.getKey() + " value: "+ entry.getValue());
		}

	}

	public void Set(){
		Set<String> keySet = new HashSet();
		Iterator<String> it = keySet.iterator();

		while(it.hasNext()){
			String key = it.next();
			System.out.println(key );
		}
	}

	public void ArrayList(){
		ArrayList<Integer> a = new ArrayList<>();

		for(int i =0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}

	public void LinkedHashSet(){
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
	}

	public void LinkedHashMap(){
		LinkedHashMap lm = new LinkedHashMap();
		lm.put("a", 0);
		lm.put("b", 1);
		lm.put("c", 2);

		//get a set of entry
		Set set = lm.entrySet();
		//iterator
		iterator i = set.iterator();
		//Display elements

		while(i.hasNext()){
			Map.Entry em = (Map.Entry) i.next();
			System.out.println(em.getKey() + " " + em.getValue());
		}
	}




	public static void main(String[] args){

	}
}