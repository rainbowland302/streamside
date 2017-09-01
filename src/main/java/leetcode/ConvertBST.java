package leetcode;

/*
Easy
Recursion backtrack traverse
Given a Binary Search Tree (BST), convert it to a Greater Tree
Every key of the original BST is changed to
the original key plus sum of all keys greater than the original key in BST.

Example:

Input: The root of a Binary Search Tree like this:
              5
            /   \
           2     13

Output: The root of a Greater Tree like this:
             18
            /   \
          20     13
*/

import leetcode.Utils.TreeNode;

public class ConvertBST {
    private static int sum;
    public static TreeNode run(TreeNode root) {
        sum = 0;
        traverse(root);
        return root;
    }
    private static void traverse(TreeNode node) {
        if(node == null) return;
        traverse(node.right);
        node.val += sum;
        sum = node.val;
        traverse(node.left);
    }
}
