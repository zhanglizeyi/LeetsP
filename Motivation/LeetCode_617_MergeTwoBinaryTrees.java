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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
 
        //merge and pre-order
        return postorder(t1, t2);
    }
    //root, left, right
    private TreeNode preorder(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) {
            return null;
        } else if(t1 == null && t2 != null) {
            return t2;
        } else if( t1 != null && t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        t1.left = preorder(t1.left, t2.left);
        t1.right = preorder(t1.right, t2.right);
        return t1;
    }
    //left, root, right
    private TreeNode inorder(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) {
            return null;
        } else if(t1 == null && t2 != null) {
            return t2;
        } else if( t1 != null && t2 == null) {
            return t1;
        }
        t1.left = inorder(t1.left, t2.left);
        t1.val += t2.val;
        t1.right = inorder(t1.right, t2.right);
        return t1;
    }
    //left, right, root
    private TreeNode postorder(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) {
            return null;
        } else if(t1 == null && t2 != null) {
            System.out.println("return t2 " + t2.val);
            return t2;
        } else if( t1 != null && t2 == null) {
            System.out.println("return t1 " + t1.val);
            return t1;
        }
        t1.left = postorder(t1.left, t2.left);
        System.out.println("t1.left: " + t1.left);
        t1.right = postorder(t1.right, t2.right);
        System.out.println("t1.right: " + t1.right);
        t1.val += t2.val;
        System.out.println("t1.val: " + t1.val);
        return t1;
    }
    
    
}
