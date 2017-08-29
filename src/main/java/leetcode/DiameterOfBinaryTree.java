package leetcode;
/*
Easy
Recursion
The diameter of a binary tree is the length of the longest path between any two nodes in a tree.

Example:
Given a binary tree
          1
         / \
        2   3
       / \
      4   5
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.
*/
import leetcode.Utils.TreeNode;

public class DiameterOfBinaryTree {
    public static int run(TreeNode root) {
        // simplest
        if (root == null) return 0;
        //simpler
        TreeNode left = root.left;
        TreeNode right = root.right;
        int res1 = run(left);
        int res2 = run(right);
        int res3 = maxDepth(left) + maxDepth(right);
        return Math.max(Math.max(res1, res2), res3);
    }

    private static int maxDepth(TreeNode node) {
        // simplest
        if (node == null) return 0;
        // simpler
        return Math.max(maxDepth(node.left), maxDepth(node.right)) + 1;
    }
}
