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


<h2>Lvalues and Rvalues</h2>

	There are two kinds of expressions in C++

	lvalue - expressions that refer to a memory location is called
			 "lvalue" expression. An lvalue may appear as either the 
			 left-hand or right-hand side of an assignment.

	rvalue - The term rvalue refers to a "data" value that is stored at
			 some address in memory. An rvalue is an expression that 
			 cannot have a value assigned to it which means an rvalue may appear on the right-hand but not left-hand side of an assignemnt.

<h2>Scope</h2>

	可以分为三个part来讨论

	1. Inside a funciton or a block which is called local variable

	2. In the definition of function parameters which is called formal parameters

	3. Outside of all functions which is called global variables


<h2>Initializing local and Global variables</h2>

	Data Type 			Initializer

	int 				0
	char 				'\0'
	float				0
	double				0
	pointer				NULL


	Boolean literals:
		A value of true representing true
		A value of false representing false

		true equal to 1 
		false equal to 0

	Character literals:

	Escape Sequence 		Meaning
	\\						\ character
	\'						' character
	\"						" character
	\?						? character 
	\a                      Alert or bell
	\b                      backspace
	\f 						From feed
	\n 						Newline
	\r 						Carriage return
	\t 						Horizontal tab
	\v 						Vertical tab
	\ooo 					Octal number of one to three digits
	\xhh...					Hexadecimal number of one or more digits

	String literals:

		"hello, dear"

		"hello, \

		dear"

		"hello, " "d" "ear"

<h2>Defining Constants</h2>

	There are two simple ways in C++ to define constants

		Using  #define preprocessor

		Using const keyword

	The #define preprocessor 

		#define identifier value


	Const Keyword:
		const prefix to declare constants with a specific type as follows:
		
<h2>The auto Storage Class</h2>

	The <b>"auto"</b> storage class is the default storage class for all local
	variables.

	"auto" can only be use in functions.

<h2>The register Storage Class</h2>

	The <b>"register"</b> storage class is used to define local variables that 
	should be stored in a register instead of RAM. 
	
	This means that the variable has a maximum size equal to the register size
	(usually one word) and can't have the unary '&' operator applied to it 
	(no memory location)

	{ register int miles/counter;  } 帮助我们更快的去使用一些东西不需要使用到内存的，快速的(不一定会存储在register上，取决于硬件)

<h2>The static Storage Class</h2>

	static 静态全局变量，它只针对它自己的文件是可见的

	代码区在 low address 全局数据区在stack heap 上， high address

	ex: 
		static int n; //静态全局变量

		int n； //全局变量

	1. 全局变量是不显示用static修饰的全局变量， 全局变量默认是有外部链接性的，作用域是
		整个工程，在一个文件内定义的全局变量，在另一个文件中，通过extern 全局变量的声明
		就可以使用全局变量。

	2. 全局静态变量，是显示用static修饰的全局变量，作用域是声明它存在的文件， 其他文件即使
		extern 也不能使用它。

	<b>静态局部变量</b>


<h2>The mutable Storage Class</h2>

	The <b>mutable</b> specifier applies only to class objects, it allows a member of an object to override constness. That is, a mutable member can be modified by a const member function. 


<h2>Operator</h2>

	Arithmetic Operators
	
	Ralational Operators

	Logical Operators 

	Bitwise Operators

	Assignment Operators

	Misc Operators 

	This chapter will examine the arithmetic, relational, logical,
	bitwise, assignment and other operators one by one.


	Arithmetic Operators







