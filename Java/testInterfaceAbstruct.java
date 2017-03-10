import java.util.*;


public class testInterfaceAbstruct extends dogAbstract implements dogInterface{
	private String name;
	private String age;

	@Override 
	public void breed(){};

	@Override
	public void color(){};

	@Override 
	public void age(){};

	//class method
	public void print(){
	} 

	//abstract 
	public void Abstract(){
		System.out.println("in testInterfaceAbstruct class");
	}

	public void bark(){
		System.out.println("big");
	}

	public void size(){
		System.out.println("asdf");
	}

	public static void main(String[] args){
		testInterfaceAbstruct a = new testInterfaceAbstruct();
		a.bark();
		a.size();
	}
}