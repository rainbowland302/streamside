/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.Test;

import static leetcode.Utils.*;
import static org.junit.Assert.*;

import leetcode.*;
import leetcode.Utils.TreeNode;

import javax.rmi.CORBA.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AppTest {
    @Test
    public void testLongestCommonPrefix() {
        assertEquals("wh", LongestCommonPrefix.run(new String[]{"whose", "what", "wh"}));
        assertEquals("lo", LongestCommonPrefix.run(new String[]{"loo", "loa", "lob"}));
        assertEquals("", LongestCommonPrefix.run(new String[]{"a", "", "b"}));
    }

    @Test
    public void testNumberComplement() {
        assertEquals(2, NumberComplement.run(5));
        assertEquals(0, NumberComplement.run(1));
        assertEquals(15, NumberComplement.run(16));
    }

    @Test
    public void testRelativeRank() {
        String[] expVal = new String[]{"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"};
        assertArrayEquals(expVal, RelativeRank.run(new int[]{10, 3, 8, 9, 4}));
    }

    @Test
    public void testFirstUniqueCharacter() {
        assertEquals(2, FirstUniqueCharacter.run("loveleetcode"));
        assertEquals(-1, FirstUniqueCharacter.run("lool"));
    }

    @Test
    public void testSumNestedArray() {
        assertEquals(0, SumNestedArray.run(new Object[]{}));
        assertEquals(28, SumNestedArray.run(new Object[]{new Object[]{1, new Integer[]{2, 3}}, new Integer[]{4, 5}, 6, 7}));
    }

    @Test
    public void testPossibleBinary() {
        assertArrayEquals(new String[]{}, PossibleBinary.run(0));
        assertArrayEquals(new String[]{"10", "00", "11", "01"}, PossibleBinary.run(2));
        assertArrayEquals(new String[]{"110", "010", "100", "000", "111", "011", "101", "001"}, PossibleBinary.run(3));
    }

    @Test
    public void testMergeTrees() {
        TreeNode node1 = arrayTotree(new int[]{1, 2, 3, 4, 5, 6, 7});
        TreeNode node2 = arrayTotree(new int[]{1, 2, 3, 4, 5, 6, 7});
        TreeNode node3 = MergeTrees.run(node1, node2);
        assertArrayEquals(new int[]{2, 4, 6, 8, 10, 12, 14}, treeToArray(node3));
    }

    @Test
    public void testStackToQueue() {
        StackToQueue queue = new StackToQueue();
        assertEquals(true, queue.empty());
        queue.push(1);
        assertEquals(false, queue.empty());
        assertEquals(1, queue.peek());
        queue.push(2);
        queue.push(3);
        assertEquals(1, queue.peek());
        assertEquals(1, queue.pop());
        assertEquals(2, queue.pop());
        assertEquals(3, queue.pop());
    }

    @Test
    public void testQueueToStack() {
        QueueToStack stack = new QueueToStack();
        assertEquals(true, stack.empty());
        stack.push(1);
        assertEquals(false, stack.empty());
        assertEquals(1, stack.top());
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.top());
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    public void testPermutation() {
        // double brace initialization
        // outer for creates an anonymous class
        // inner for construct object
        List<List<Integer>> permutes = new ArrayList<List<Integer>>() {{
            add(Arrays.asList(1, 2, 3));
            add(Arrays.asList(1, 3, 2));
            add(Arrays.asList(2, 1, 3));
            add(Arrays.asList(2, 3, 1));
            add(Arrays.asList(3, 1, 2));
            add(Arrays.asList(3, 2, 1));
        }};
        assertEquals(permutes, Permutation.run(new int[]{1, 2, 3}));
    }

    @Test
    public void testDiameterOfBinaryTree() {
        TreeNode tree = arrayTotree(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals(5, DiameterOfBinaryTree.run(tree));
    }

    @Test
    public void testGenerateParenthesis() {
        List<String> paren1 = new ArrayList<String>() {{
            add("()");
        }};
        List<String> paren2 = new ArrayList<String>() {{
            add("(())");
            add("()()");
        }};
        List<String> paren3 = new ArrayList<String>() {{
            add("((()))");
            add("(()())");
            add("(())()");
            add("()(())");
            add("()()()");
        }};
        assertEquals(paren1, GenerateParenthesis.run(1));
        assertEquals(paren2, GenerateParenthesis.run(2));
        assertEquals(paren3, GenerateParenthesis.run(3));
    }

    @Test
    public void testReverseWords() {
        String s = "Origin";
        StringBuilder sb = new StringBuilder("Origin");
        ReverseWords.callByValue(s, sb);
        assertEquals("Origin", s);
        assertEquals("OriginChanged", sb.toString());
        assertEquals("s'teL ekat edoCteeL tsetnoc", ReverseWords.run("Let's take LeetCode contest"));
        assertEquals("s'teL ekat edoCteeL tsetnoc", ReverseWords.run("Let's take LeetCode contest"));
    }

    @Test
    public void testConvertBST() {
        TreeNode src = arrayTotree(new int[]{4, 2, 6, 1, 3, 5, 7});
        TreeNode tar = arrayTotree(new int[]{22, 27, 13, 28, 25, 18, 7});
        assertArrayEquals(treeToArray(tar), treeToArray(ConvertBST.run(src)));
    }

    @Test
    public void testSubTree() {
        TreeNode tree = arrayTotree(new int[]{4, 2, 6, 1, 3, 5, 7, 8});
        TreeNode subtree = arrayTotree(new int[]{6, 5, 7});
        TreeNode nonSubtree = arrayTotree(new int[]{2, 1, 3});
        assertEquals(true, SubTree.run(tree, subtree));
        assertEquals(false, SubTree.run(tree, nonSubtree));
    }

    @Test
    public void testPalindromeLink() {
        ListNode link1 = Utils.arrayToList(new int[]{1, 2, 3, 2, 1});
        ListNode link2 = Utils.arrayToList(new int[]{1, 2, 3, 3, 2, 1});
        ListNode link3 = Utils.arrayToList(new int[]{1, 2, 3, 4, 2, 1});
        assertEquals(true, PalindromeLink.run(link1));
        assertEquals(true, PalindromeLink.run(link2));
        assertEquals(false, PalindromeLink.run(link3));
    }

    @Test
    public void testIntersectionNode() {
        ListNode link1 = Utils.arrayToList(new int[]{1, 2, 3});
        ListNode link2 = Utils.arrayToList(new int[]{1, 2});
        ListNode link3 = Utils.arrayToList(new int[]{4, 5});
        ListNode link4 = Utils.arrayToList(new int[]{6, 7});
        assertArrayEquals(new int[]{1,2,3,4,5}, Utils.listToArray(link1.add(link3)));
        assertArrayEquals(new int[]{1,2,4,5}, Utils.listToArray(link2.add(link3)));
        assertEquals(link3, IntersectionNode.run(link1, link2));
        assertEquals(link3, IntersectionNode.run(link1, link3));
        assertEquals(link3, IntersectionNode.run(link2, link3));
        assertEquals(null, IntersectionNode.run(link1, link4));
    }
}