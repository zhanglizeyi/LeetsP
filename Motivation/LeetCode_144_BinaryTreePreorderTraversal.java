/**
Problem: Given a binary tree, return the preorder traversal of its nodes' values.

Example: 
Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,2,3]

Solution: DFS(iteration or Recursive). 

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
    public List<Integer> preorderTraversal(TreeNode root) {
        //Init
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        //Sanity check
        if(root == null) {
            return new ArrayList<Integer>();
        }

        stack.push(root);

        while(!stack.isEmpty()) {

            TreeNode node = stack.pop();
            result.add(node.val);

            if(node.right != null) {
                stack.push(node.right);
            }
            if(node.left != null) {
                stack.push(node.left);
            }
        }

        // helper(root, result);

        return result;
    }

//     //Recursion
//     private void helper(TreeNode node, List<Integer> result) {

//         if(node != null) {
//             result.add(node.val);
//             helper(node.left, result);
//             helper(node.right, result);
//         }
//     }
}

