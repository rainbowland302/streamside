package leetcode;

import leetcode.Utils.ListNode;

public class IntersectionNode {
    public static ListNode run(ListNode headA, ListNode headB) {
        int lengthA = getLinkLength(headA);
        int lengthB = getLinkLength(headB);
        while (lengthA > lengthB) {
            lengthA--;
            headA = headA.next;
        }
        while (lengthB>lengthA) {
            lengthB--;
            headB = headB.next;
        }
        while (headA != null && headB != null) {
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    private static int getLinkLength(ListNode node) {
        int count = 0;
        while (node != null) {
            node = node.next;
            count++;
        }
        return count;
    }
}
