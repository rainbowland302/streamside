package leetcode;

import java.util.*;

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

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public ListNode add(ListNode head) {
            ListNode node = this;
            while (node.next != null) {
                node = node.next;
            }
            node.next = head;
            return this;
        }

        public ListNode add(int[] arr) {
            ListNode node = this;
            while (node.next != null) {
                node = node.next;
            }
            node.next = arrayToList(arr);
            return this;
        }
    }

    public static int[] listToArray(ListNode node) {
        List<Integer> res = new LinkedList<>();
        while (node != null) {
            res.add(node.val);
            node = node.next;
        }
        return res.stream().mapToInt(a -> a).toArray();
    }

    public static ListNode arrayToList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode preNode = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            preNode.next = node;
            preNode = node;
        }
        return head;
    }
}

