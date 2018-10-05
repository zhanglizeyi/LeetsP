/**
Problem:
Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

Example: 
Input: [1,2,3,null,5,null,4]
Output: [1, 3, 4]
Explanation:

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---


Solution: Few options for this question, DFS(stack)/BFS(queue) or recursive function to solve this problem. 

DFS: create two stacks one save Node and the other one saves height, always save left node in bottom of the stack and right at top, then everytime the pop will always from very right of the TreeNode.

The order:     1               2               3
	   stack height   stack height    stack height
     init    1     0         
             
      pop    1     0        3      1        4     2         ....   
      
             3     1        4      2       null   2
      store  2     1       null    2        2     1
                             2     1

Recursive: Create a help method which will recursivly check right to the bottom and left until finish read all the tree datas.

The order: 1, 3, 4, 3, 1, 2, 5, 2, 1


*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        if(root == null) {
            return list;
        }

        helper(root, 0, list);
        return list;
        
//         // DFS
//         Map<Integer, Integer> map = new HashMap<>();
//         Stack<TreeNode> stack = new Stack<>();
//         Stack<Integer> depStack = new Stack<>();
        
//         //init
//         stack.push(root);
//         depStack.push(0);
//         while(!stack.isEmpty()) {
//             TreeNode n = stack.pop();
//             int dep = depStack.pop();
            
//             if(n != null) {
                
//                 if(!map.containsKey(dep)) {
//                     map.put(dep, n.val);
//                 }
                
//                 stack.push(n.left);
//                 depStack.push(dep+1);
//                 stack.push(n.right);
//                 depStack.push(dep+1);
//             }
//         }
        
//         List<Integer> list = new ArrayList<>();
//         if(root == null) { 
//             return new ArrayList<Integer>();
//         }
        
//         for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             list.add(entry.getValue());
//         }

//         return root==null ? new ArrayList<Integer>() : list;
    }
    
    private void helper(TreeNode node, int height, List<Integer> list) {
        if(node == null) {
            return;
        }
        
        if(list.size() <= height) {
            list.add(node.val);
        }
        helper(node.right, height+1, list);
        helper(node.left, height+1, list);
    }
}
 
