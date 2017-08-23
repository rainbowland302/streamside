package leetcode;

import java.util.*;

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
public class Utils {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode arrayTotree(int[] arr) {
        List<TreeNode> nodeList = new ArrayList<>();
        for (int i : arr) {
            nodeList.add(new TreeNode(i));
        }
        for (int i = 0; i < arr.length; i++) {
            TreeNode node = nodeList.get(i);
            try {
                node.left = nodeList.get(i * 2 + 1);
            } catch (IndexOutOfBoundsException e) {
                node.left = null;
            }
            try {
                node.right = nodeList.get(i * 2 + 2);
            } catch (IndexOutOfBoundsException e) {
                node.right = null;
            }
        }
        return nodeList.get(0);
    }

    public static int[] treeToArray(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.addFirst(root);
        while (queue.size() > 0) {
            TreeNode node = queue.removeLast();
            if (node != null && node.left != null) queue.addFirst(node.left);
            if (node != null && node.right != null) queue.addFirst(node.right);
            if (node != null) res.add(node.val);
        }
        return res.stream().
                mapToInt(a -> a).
                toArray();
    }
}

