import java.util.*;

public class pow50E{

	public static double Solution(double x, int n){
		double ret = 1;
		if(n==0) return 1;
		if(n<0){
			n = -n;
			x = 1/x;
			
			for(int i=0; i<n; i++){
				ret *= x;
			}
		}
		else{
			for(int i=0; i<n; i++){
				ret *= x;
			}
		}

		return ret; 

		//n%2 == 0 ? Solution(x*x, n/2) : x*Solution(x*x, n/2);
	}

	public static void main(String[] args){

		System.out.println(Solution(8.88023, -5));
	}
}