/**
Given a set of distinct integers, nums, return all possible subsets (the power set).
Note: The solution set must not contain duplicate subsets.

Example: 
Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]

Solution: DFS recursive to solve the problem, not easy to understand. 
Find all the possible permutations of input array, so can think it as a tree

              [ ]
             / |\
           /   |  \
         /     |    \
      [1]     [2]    [3]
     /  \      | 
   /     \     |
 [1,2]   [1,3] [2,3]

 Traverse the tree order like [] [1] [1,2] [1,2,3] [1,3] [2] [2,3] [3], DFS with preorder. 

*/ 

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //DFS to do the deep search for each level and add the array into result

        //Init
        List<List<Integer>> result = new ArrayList<>();
        //storage
        Stack<Integer> stack = new Stack<>();

        helper(result, stack, nums, 0);

        return result;
    }

    //Recursion
    private void helper(List<List<Integer>> result, Stack<Integer> stack, int[] nums, int index) {
        //Add each changes into result
        result.add(new ArrayList<Integer>(stack));

        for(int i = index; i < nums.length; i++) {
            stack.push(nums[i]);
            helper(result, stack, nums, i + 1);
            stack.pop();
        }
    }
}
