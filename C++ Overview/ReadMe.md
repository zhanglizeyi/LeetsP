<h1>Learn C++ Overview:</h1>

C++ is middle-level language, as it comprises a combination of both high-level and low-level langauge features

<h2>Object-Oriented Programming</h2>
	<ul>
		Encapsulation
		Data Hiding
		Inheritance
		Polymorphism
	</ul>

<h2>Standard Libraries:</h2>
	
		<ul>
			<ol>
				1. The core language giving all the building blocks including variables, data types and literals
			</ol>
			<ol>
				2. The C++ standard Library giving a rich set functions manipulating files, strings
			</ol>
			<ol>
				3. The standard Template Library(STL) giving a rich set of methods manipulating data structures
			</ol>
		</ul>

<h2>Linux Installation</h2>

		Check version of C++: g++ -v


<h2>C++ Program basic idea</h2>

	<ul>
		
			<b>Object</b> - objects have properties and behaviors. 
			Example: A dog has properties - color, name, breed as well as behaviors - wagging, barking, eating. 
			An object is an instance of a class.

			狗会有很多不同的性质，但是object是它的实例。
		
	
			<b>Class</b> - A class can be defined as a template/blueprint that describes the behaviors/states that object of its type support.

			蓝图，模板


			<b>Methods</b> - A method is basically a behavior. A class can contain many methods. It is in methods where the logics are written, data is manipulated and all the actions are executed.
			
			一个class里面可以有多个methods，methods是要逻辑性写出，data是会被处理的

			<b>Instance Variables</b> - Each obejct has its unique set of instance variables. An obejct's state is created by the values assigned to these instance variables.

			每个object都有自己的特殊的一套实例vars, object

	</ul>

	<b>C++ language defines several headers, and <iostream> is needed.</b>


	Type       Typical Bit Width     Typical Range

	char		1 byte				-128 to 127 or 0 to 255

	unsigned
	char		1 byte				0 to 255

	signed
	char		1 byte				-128 to 127

	int 		4 bytes				-2147483648 to 2147483648

	unsigned
	int 		4 bytes				0 to 4294967295

	signed
	int         4 bytes				-2147483648 to 2147483648


	short 
	int      	2 bytes				-32768 to 32767

	unsigned
	short int   2 bytes 			0 to 65,535

	long 
	int  		8 bytes				-2,147,483,648 to 2,147,483,647

	signed
	long int 	8 bytes				-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

	float		4 bytes				+/- 3.4e +/- 38 (~7 digits)

	double 		8 bytes				+/- 1.7e +/- 308 (~15 digits)

	long double 8 bytes 			+/- 1.7e +/- 308 (~15 digits)

	wchar_t		2 or 4 bytes		1 wide character


<h2>Type Declarations</h2>

	Create a new name for an existing type using typedef

	ex: typedef type newname;

	ex: typedef int feet;   feet distance;


<h2>Enumerated Types</h2>

	Enumerated type declares an optional type name and a set of zero or more identifiers that can be used as values of the type. Each enumerator is a constant whose type is the enumeration.

	enum enum-name {list of names} var-list;

	ex: enum color { red, green, blue } c;
		c = blue;


	by dfault the value of the first name red is 0, second green is 1, and third is 3...so on. 
	And also can name it as

		enum color { red, green=5, blue }

	Then, blue will have a value of 6 because each name will be one greater than the one that precedes it. 

<h2>Variable Definition in C++</h2>

	extern int a, b;
	extern int c;
	extern float f;


	extern 是一个声明，variable的定义， 最初是为了连接 C 和 C++ 

	extern "C" char* strcpy(char*, const char*)
	声明 "C" 不影响语义，但是连接方式不改变

	extern char* strcpy(char*, const char*)
	声明一个变量不是定义，也不会改变语义，但是会改变它的编译和连接方式

	如果你有很多语言加上extern "C", 你可以将它们放到extern "C"{}中 






	










