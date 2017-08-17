package leetcode;

/*
Easy
Recursion
Write a function that generates all possible combinations of 1 and 0 for n bits.
For example, if the function receives 2 as the number of bits,
it should produce the following 4 combinations: 00,01,10,11.
You cannot use any mathematical operators.
*/

import java.util.ArrayList;
import java.util.List;

public class PossibleBinary {
    public static String[] run(int n) {
        if (n == 0) {
            return new String[]{};
        }
        if (n == 1) {
            return new String[]{"0", "1"};
        }
        List<String> res = new ArrayList<>();
        for (String str : run(n - 1)) {
            res.add("1" + str);
            res.add("0" + str);
        }
        return res.toArray(new String[0]);
    }
}

