//Tutorial 26 Learning about threads

import java.util.*;

public class Tuna implements Runnable{
	String name;
	int time;
	Random r = new Random();
	
	public Tuna(String x){
		name = x;
		time = r.nextInt(999);
	}
	
	
	public void run(){
		try{
			System.out.printf("%s us sleep for %d\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done\n", name);
		}catch(Exception e){
//			System.out.println("issue occur");
		}
	}
}
