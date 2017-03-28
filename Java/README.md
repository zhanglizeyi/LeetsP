Java Overview:
	
	Object(state and behaviors): Objects have states and behaviors
				A dog has states, 
									color
									name
									breed
				as well as behavior such as wagging their tail,
				barking, eating.
				An object is an instance of a class.

	Class: A class can be defined as a template/blueprint that 
			describes the behavior/states that object of its type
			supports.

	Methods: A method is basically a behavior. A class can contain many
			methods. It is in methods where the logics are written, data
			is manipulated and all the actions are executed.

	Instance Variable:
			Each obejct has its unique set of instance variable.
			An object's state is created by the values assigned to 
			these instance variables.		

	Syntax:

		class names: for all class names the first letter should be in
					upper case. cammel
				ex:	class MyFirstClass

		method names: for all method names should start with a lower 
					  case letter. If several words are used to form the name of the method, then each inner word's first letter should be in upper case.
				ex: public void myMethodName()

		Program File name: name of the program file should exactly match
							the class name.

	Modifier:

		Access Modifier: 
				default, public, private, protected

		Non-access Moifier:
				final, abstract, strictfp

	Java variables:
		Local variables
		Class variables (static variables)
		Instance variables (non-static variables)



	Inheritance:
		Class can be derived from classes. Basically, if you need to create a new class and here is already a class that has some of the code you require, then it is possible to derive your new class from the already existing code.
		In this scenario, the existing class is called superClass and the derived class is called the subclass.

	Interfaces:
			an interfaces can be defined as a contract between objects on how to communicate with each other. Interfaces play a vital role when it comes to the concept of inheritance. 

	Local varibales: declare inside methods, coustructor, blocks. local vars will be destory whiles method completed.

	Instance varibales: Instance variables are variables within a class but outside "any method". These variables are initalized when the class is instantiated. Instance variables can be accessed from inside any method, constructor or blocks of that particular class.
	
	Class variables: Class variables are variables declared within a class, outside any method, with the static keyword.

	Constructors:
			Every class has a constructor. if we dont write one, java will give a default one. Each time a new object is created, at least one constructor will be invoked. 
			The main rule constructor must has the same name as class name.
			A class can have more than one constructor. 

	Create an object:

		Declaration - A variable declaration with a variable name with an obejct type

		Instantiation - The 'new' keyword is used to create the object

		Initialization - The 'new' keyword is followed by a call to a constructor. This is call initialzes the new objects.


	Source file: 
		1. There can be only one public class per source file.
		2. A source file can have multiple non-public classes.

		Classes have several access levels and there are different types of classes; abstract classes, final classes, etc. We will be explaining about all these in the access modifiers chapter.
		
		Apart from the above mentioned types of classes, java also has some special classes called Inner classes and Anonymous classes.


	1 byte = 8 bits
		min = -128 (2^7)
		max = 127 (2^7 -1)
		defalut value is 0
		ex: byte a = 100, byte b = -50;

	1 short = 16 bits
		min = -32,768(2^15)
		max = 32,767(2^15 - 1)
		defalut = 0
		ex: short s = 10000, short r = -2000;

	1 int = 32 bit 
		min = -2147483648 (2^31)
		max = 2147483647 (2^31 -1)

	1 float = 32 bit single-percision
		ex: float a = 123.5

	1 double = 64 bit double-percision
		ex: double a = 123.55

	1 char = 16 bit
		min = \u000 or 0
		max = \ufff or 65,535


	Modifier types:

		Access Control Modifiers:
			visible package by defalut 
			visible to the class only(private)
			visible to the world(public)
			visible to the package and all subclasses(protected)

		Non-access modifiers:
			The static modifier for creating class methods and varibales
			The final modifier for finalizing the implementations of classes, methods, and variables
			The abstract modifier for creating abstract classes and methods
			The synchronized and volatile modifiers, which are used for threads


	Methods:

		modifier returnType nameOfMethod (parameter list){
			//method body
		}

		modifier - It defines the access type of the method and it is optional to use

		returnType - Method may return the type 


	This:
		this is a keyword in java which is used as a reference to the object of the current class, with in an instance method or a constructor.
		using this you can refer the members of a class such as constructors, vars and methods.

		this -> only within instance methods or constructors. 


	Inner classes:

			Inner class

			Method-local Inner class

			Anonymous Inner class




	Lecture2:
		ADT(Abstract Data Type): Java, Object, packages 
			Example:
				To drive a car, there has an abstract idea of brakes.
				But for the idea of work, the car needs to have a specific implementation of brakes.
				Abstraction is an idea, which need a specific implementation. 

		API(abstract program interface): language specific



		Example: 
			public class Bag<Present> implements Collection<Present>

							   stuff                           ADT

			Bag "is-a" Collection

			LinkedList and ArrayList "is-a" List

				List is a data type, but you cannot create a List by new List()

				To create a List, you must create an instance of a class that implements the List interface



	Big-O:
		f(n) = O(g(n)), if there are positive constants c and n0 such that f(n) <= c*(g(n)) for all n > n0
	Big-Omega:
		f(n) = Omega(g(n)), if there are positive constants c and n0 such that f(n) >= c*(g(n)) for all n > n0 



	Big-O is capturing the growth of running time, but it is not capturing real running time


<h2>
	Sort Algorithm:

		Insertion sort: O(n) O(nlogn) O(n^2)
		Selection sort: O(n) O(nlogn) O(n^2)
		Merge sort: O(nlogn)
		Quick sort: O(nlogn) O(n^2)
		Bubble sort: O(nlogn) 
		heap sort: O()
		//Check sort: 

		stack:
		queue:
		Priority Queue:
		Heap:

		BST:
		BFS:
		DFS: 
		tries:
</h2>

<h1>General-purpose implementation:</h1>
<p>
Interface   hashTable		Resizable array  Tree          	 LinkedList      
			implementation  implementation   Implementation  implementation

Set         HashSet          				 TreeSet	
List 						 ArrayList						 LinkedList
Queue
Deque		               	 ArrayDeque						 LinkedList
Map 		HashMap							  TreeMap


HashTable + LinkedList
Implementation 

LinkedHashSet


LinkedHashMap
</p>


<h1>Classes for web Access</h1>
<p>
	import java.net.*;
	import java.io.*;

	URL url = new URL("www.Destination.com");
	InputStream ins = url.openStream(); //object
	InputStreamReader isr = new InputStreamReader(ins);
	BufferedReader web = new BufferedReader(isr);

	String line;
	while((line = web.readLine()) != null){
		System.out.println(line);
	}
</p>

<h1>Find Time Complexcity Rule</h1>
	
<ol>
	<li>
		+, -, *, /, if, --> 1 step
	</li>
	<li>
		Loop, subrotine  --> n step
	</li>
	<li>
		memory access  --> 1 step
	</li>
</ol>


	For example: 

		int sum = 0;	//instruction is 1  c0
		for(int i=0; i<sum.length; i++){ //n times
			if(...)    // 1 instruc  c1
				sum++; //...         c2
			sum += 2;  //1 instruc   c3
		}

	Calculation: c0 + n(c1 + c3) , c2 is in c1 and excue only once


<h2>Array:</h2>
	<ol>
		<li>search O(n)</li>
		<li>access O(1)</li>
		<li>insert O(n)</li>
		<li>Delete O(n)</li>
	</ol>	

<h2>Two-D Array</h2>
<p>
</p>







