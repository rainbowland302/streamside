package leetcode;

import leetcode.Utils.ListNode;

import java.util.ArrayList;
import java.util.Objects;

public class PalindromeLink {
    public static boolean run(ListNode head) {
        ArrayList<Integer> tmp = new ArrayList<>();
        while (head != null) {
            tmp.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < tmp.size()/2; i++) {
            if(!Objects.equals(tmp.get(i), tmp.get(tmp.size() - i - 1))) return false;
        }
        return true;
    }
}
