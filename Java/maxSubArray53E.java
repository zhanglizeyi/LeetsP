import java.util.*;


public class maxSubArray53E{


	public static int Solution(int[] nums){
		//DP problem

		//define two vars
		int maxNum = -2147483647; //min of int
		int sub = 0;

		for(int i=0; i<nums.length; i++){
			maxNum = Math.max(maxNum, sub+nums[i]); 
			// keep itself, whenever change with big number found
			sub = Math.max(0, sub+nums[i]); // find bigger value 
		}

		return maxNum;

	}

	public static void main(String[] args){

		int[] test = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

		System.out.println(Solution(test));
	}
}