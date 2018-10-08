/**
Problem: Given a binary tree, return the inorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]

Solution: DFS(iteration or recursive) both will solve the problem.

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
    public List<Integer> inorderTraversal(TreeNode root) {
        //Init
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        // if(root == null) {
        //     return new ArrayList<Integer>();
        // }
        // helper(result, root);
        
        //Iteration
        while(!stack.isEmpty() || root != null) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode node = stack.pop();
            result.add(node.val);
            root = node.right;
        }
        
        return result;
    }
    
    // private void helper(List<Integer> result, TreeNode node) {
    //         if(node.left != null) {
    //             helper(result, node.left);
    //         } 
    //         result.add(node.val);
    //         if(node.right != null) {
    //             helper(result, node.right);
    //         }
    // }
}

