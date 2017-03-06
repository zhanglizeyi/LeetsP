import java.util.*;


public class TypeParameter<T>{

	private T lastElement;
	private int num;

	public TypeParameter(){
		num = 0;
		lastElement = null;
	}

	public void add(T e){

		T l = lastElement;
		lastElement = e;
		num++;
	}

	public static void main(String[] args){
		TypeParameter<String> t = new TypeParameter<String>();

		TypeParameter<Integer> t2 = new TypeParameter<Integer>();

		t.add("wala");
		t2.add(2);

		System.out.println("this is type parameter");
	}

}