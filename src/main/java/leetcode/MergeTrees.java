package leetcode;

import leetcode.Utils.TreeNode;
/*
 * Easy
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class MergeTrees {
    public static TreeNode run(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return null;
        if(t1 == null) return t2;
        if(t2 == null) return t1;
        TreeNode node = new TreeNode(t1.val + t2.val);
        node.left = run(t1.left, t2.left);
        node.right = run(t1.right, t2.right);
        return node;
    }
}

