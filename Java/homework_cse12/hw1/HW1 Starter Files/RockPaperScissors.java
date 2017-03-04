//package cse12_hw1;

/** 
 * Class RockPaperScissors.  Plays repeated games of Rock Paper Scissors with a user 
 * @author Your Name
 * @date The date
 * */
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;
import java.util.*;
 
public class RockPaperScissors
{

  private static String kkk = "Instance Var";
 
  public void abstruct(){
  	System.out.println("abstruct func");
  }

  private RockPaperScissors r = new RockPaperScissors();

  public void print(){
  	r.abstruct();
  }

  public static void MachinePick(char a, String b){
  	  	if(b.charAt(0) =='r') System.out.println("I choose "+a+". It's a tie");
  		else if(b.charAt(0) == 's') System.out.println("I choose "+a+". You win!");
  		else if(b.charAt(0) == 'p') System.out.println("I choose "+a+". You lost!");
  		else System.out.println("That is not a valid move. Please try again.");
  }

  public static void rules(char a, String b){
  	switch (a) {
  		case 'r':
  			MachinePick(a, b);
  			break;
  		case 'p':
  			MachinePick(a,b);
  			break;
  		case 's':
  			MachinePick(a,b);
  			break;
  		default:
  			System.out.println("That is not a valid move. Please try again.");
  			break;
  	}
  }
  
  public static String randomG(){
  	String alp = "rps";
  	String s = "";
  	Random random = new Random();
  	char c = alp.charAt(random.nextInt(3));
  	s += c;
  	return s;
  }

  public static void main( String[] args )
  {
    int initialCapacity = 5;
    // Store the user's move history
    String[] userMoves = new String[initialCapacity];  
    // Store the System's move history
    LinkedList<String> systemMoves = new LinkedList<String>();  
  	
  	int userInput = 0;
  	double x = 5; //it auto cast to 5.0
  	//static can be changed, final can not 

  	    String string = "aasdfb csadfas";
    	System.out.println(string.split(" "));
    	System.out.println(string.length());
    	System.out.println(string.split(" ").length);

    	string.format("%d%s\n",14,"askdfjl"); //vaild statement

    	int xyz = 4;
    	int test = 4;
    	try{
    		for(int i=0; i<initialCapacity+1; i++){
    			System.out.println(userMoves[i]);
    		}
    	}catch(IndexOutOfBoundsException e){
    		System.out.println("out of bound exp");
    	}
    

    while(true){
    	System.out.println("Let's play! WHat's your move? (r=rock, p=paper, s=scissors or q to quit)" + kkk);
    	Scanner in = new Scanner(System.in);
    	char c = in.next().charAt(0);
    	//test
    	
    	if(c == 'r' || c == 'p' || c == 's'){
			userMoves[userInput++] = Character.toString(c);
    		String str = randomG();
    		systemMoves.add(str);
    		rules(c, str);
    	}
    	else if(c == 'q'){
    		System.out.println("Thanks for playing");
    		//print reverse order of userMoves and systemMoves
    		for(int i=userInput-1; i>=0; i--){
    			System.out.println("me: "+userMoves[i]+ "You:"+ systemMoves.get(i));	
    		}

    		break;
    	}
    	else{
    		System.out.println("That is not a valid move. Please try again."+ c);
    	}	
    	kkk = Character.toString(c);
    }

  }
}