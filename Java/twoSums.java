import java.util.*;

class twoSums{

	public static int[] twoSum(int[] nums, int target){
		Map<Integer, Integer> m = new HashMap<>();
		int[] ret = new int[2];

		for(int i=0; i<nums.length; i++){
			if(m.containsKey(target-nums[i])){
				ret[0] = m.get(target-nums[i]);
				ret[1] = i;
				return ret;
			}
			m.put(nums[i], i);
		}
		return ret;
	}

	public static void main(String[] args){
		int[] arr = {2, 7, 11, 15};
		int target = 9;
		
		System.out.println(twoSum(arr, target)[0] +"  "+ twoSum(arr,target)[1]);

	}
}