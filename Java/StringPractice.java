import java.util.*;
import java.lang.*;
import java.io.*;


public class StringPractice{

	public static void main(String args[]){

		System.out.println("=========Tutorial 1========");
		String[] words = {"funck", "chunk", "furry"};

		//start with
		for(String w : words){
			if(w.startsWith((String)"fu"))
				System.out.println(w + "  starts with fu");
		}

		//end with
		for(String w : words){
			if(w.endsWith((String)"k"))
				System.out.println(w + " end with k");
		}


		//Tutorial 2
		System.out.println("=========Tutorial 2========");
		String s = "zhanglizeyibosterz";

		System.out.println(s.indexOf('z'));
		System.out.println(s.indexOf('z',10));

		String a = "hello";
		String b = "   monster       ";

		System.out.println(a + b);
		System.out.println(a.concat(b));
		System.out.println(a.replace('h', 'A'));
		System.out.println(b.toUpperCase());
		System.out.println(b.trim());

		//Tutorial 3 Recurrsion
		System.out.println("=========Tutorial 3========");
		System.out.println(fact(5));

		//Tutorial 4 Recurrsion
		System.out.println("=========Tutorial 4========");
		String[] ss= {"eggs", "lasers", "hats", "pie"};
		List<String> list = new ArrayList<String>();

		//add array items to list
		for(String x : ss)
			list.add(x);

		String[] morethings = {"lasers", "hats"};
		List<String> list1 = new ArrayList<String>();

		//add array items to list
		for(String y : morethings){
			list1.add(y);
		}

		//Tutorial 5 ArrayList program
		//print out list
		System.out.println("=========Tutorial 5========");
		for(int i=0; i<list1.size(); i++){
			System.out.printf("%s ", list.get(i));
		}				

		editlist(list, list1);
		System.out.println();
		for(int i=0; i<list.size(); i++){
			System.out.printf("%s ", list.get(i));
		}

		System.out.println();

		if(list1 == null) {
			System.out.println("empty");
		}else{

			for(int i=0; i<list.size(); i++){
				System.out.printf("%s ", list.get(i));
			}

			for(int i=0; i<list1.size(); i++){
				System.out.printf("%s ", list.get(i));
			}		
		}

		//Tutorial 6 LinkedList
		System.out.println("==========Tutorial 6============");
		String[] things = {"apples", "noobs", "pwnge", "bacon", "goATS"};
		List<String> list2 = new LinkedList<String>();
		for(String x : things)
			list2.add(x);

		String[] things2 = {"sausage", "bacon", "goats", "harypotter"};
		List<String> list3 = new LinkedList<String>();

		for(String y : things2)
			list3.add(y);

		list2.addAll(list3);
		list3 = null;

		printMe(list2);
		System.out.println();
		removeStuff(list2, 2, 5);
		System.out.println();
		printMe(list2);
		System.out.println();
		reverseMe(list2);
		// System.out.println();
		// printMe(list2);


		//Tutorial 8 Converting Lists to Arrays
		System.out.println("\n=============Tutorial 8==============");

		String[] stuff = {"babies", "watermelong", "melons", "fudge"};
		LinkedList<String> theList = new LinkedList<String>(Arrays.asList(stuff));
		theList.add("zzzzz");
		theList.addFirst("firstthing");

		//convert back to array
		stuff = theList.toArray(new String[theList.size()]);

		for(String i : stuff)
			System.out.println(i);


		//Tutorial 9 Collections method sort
		System.out.println("\n==========Tutorial 9==========");

		String[] crap = {"apple", "banana", "cheese", "bacon"};
		List<String> l1 = Arrays.asList(crap);

		Collections.sort(l1);
		System.out.printf("%s\n", l1);

		//reverse way
		Collections.sort(l1, Collections.reverseOrder());
		System.out.printf("%s\n", l1);

		//Tutorial 10 Methods reverse and copy
		System.out.println("\n=============Tutorial 10===============");
		Character[] ray = {'p', 'a', 'b'};
		List<Character> l = Arrays.asList(ray);
		System.out.println("List is : " + l);

		//reverse and print out the list
		Collections.reverse(l);
		System.out.println("After reverse : " + l);

		//createa new array and a new list
		List<Character> listCopy = Arrays.asList(new Character[3]);

		//copy contents of list into listcopy
		Collections.copy(listCopy, l);
		System.out.println("After copy : " + listCopy);


		//Tutorial 11 Collections Methods fill
		System.out.println("\n============Tutorial 11==============");

		//fill colloction with crap
		Collections.fill(listCopy, 'X');
		System.out.println("After fill list : ");
		output(listCopy);

	}

	//Tutorial 11
	private static void output(List<Character> thelist){
		for(Character i : thelist)
			System.out.printf("%s", i);

		System.out.println();
	} 

	public static void printMe(List<String> l1){
		for(int i=0; i<l1.size(); i++){
			System.out.printf("%s ", l1.get(i));	
		}
	}

	public static List<String> removeStuff(List<String> l, int start, int end){

		//l.subList(start, end);
		for(int i=start; i<end; i++){
			l.remove(i);
		}
		return l;
	}

	public static void reverseMe(List<String> l){
		List<String> temp = new LinkedList<String>();

		// for(int i=l.size()-1; i>=0; i--){
		// 	System.out.printf("%s ", l.get(i));
		// }
		ListIterator<String> bobby = l.listIterator(l.size());
		while(bobby.hasPrevious())
			System.out.printf("%s ", bobby.previous());
	}


	public static long fact(long n){
		if(n <= 1)
			return 1;
		else
			return n * fact(n-1);
		//5 * (4 * ( 3 * ( 2 * 1)))
		// 120
	}

	public static void editlist(Collection<String> l1, Collection<String> l2){
		Iterator<String> it = l2.iterator();
		while(it.hasNext()){
			if(l1.contains(it.next()))
				it.remove();
		}
	}
}