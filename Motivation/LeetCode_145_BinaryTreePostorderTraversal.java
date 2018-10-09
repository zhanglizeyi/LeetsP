/**
Problem: Given a binary tree, return the postorder traversal of its nodes' values.

Example:
Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [3,2,1]

Solution: DFS(iteration or Recursion) the main part of post order is using LinkedList that can using addFirst() to have back order.
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
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        // helper(result, root);
        if(root == null) {
            return new ArrayList<Integer>();
        }

        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.addFirst(node.val);

            if(node.left != null) {
                stack.push(node.left);
            }
            if(node.right != null) {
                stack.push(node.right);
            }
        }

        return result;
    }

    // private void helper(List<Integer> result, TreeNode node) {
    //     if(node != null) {
    //         helper(result, node.left);
    //         helper(result, node.right);
    //         result.add(node.val);
    //     }
    // }
}
