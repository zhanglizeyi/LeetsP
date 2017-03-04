import java.io.*;

public class PuppyTest{

	public static void with(){
		System.out.println("This is with Static");
	}

	public void withOut(){
		System.out.println("This is without Static");	
	}
		
	public static void main(String args[]){
		Dog dog1 = new Dog("Saber");
		Dog dog2 = new Dog("kate");

		//Invoking methods for each obejct created
		dog1.setAge(2);
		dog1.getAge();
		dog1.barking("small");

		dog2.setAge(3);
		dog2.getAge();
		dog2.barking("medium");

		with();
		withOut();
	}


}