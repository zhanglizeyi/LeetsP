
class example1_1{

	public static void main(String[] args){
		for(int i=0; i<args.length; i++)
			System.out.print(i == 0 ? args[i] : "It is " + args[i]);
		System.out.println();
	}
}