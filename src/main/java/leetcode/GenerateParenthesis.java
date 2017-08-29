package leetcode;
/*
Medium
Recursion Backtrack
write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
*/

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    static public List<String> run(int n) {
        List<String> list = new ArrayList<>();
        backtrack("", 0, 0, list, n);
        return list;
    }

    static private void backtrack(String str, int open, int close, List<String> list, int n) {
        if (str.length() == n * 2) {
            list.add(str);
            return;
        }
        if (open < n) backtrack(str + '(', open + 1, close, list, n);
        if (close < open) backtrack(str + ')', open, close + 1, list, n);
    }
}
