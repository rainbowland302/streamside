package leetcode;

/*
Easy
Write a function to find the longest common prefix string amongst an array of strings.
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class LongestCommonPrefix {

    public static String run(String[] strs) {
        // select the shortest and split by letter
        String minStr = Arrays.stream(strs)
                .min(Comparator.comparing(String::length))
                .orElse("");
        char[] charset = minStr.toCharArray();
        // var referred in lambda must be immutable.
        for (int i = 0; i < charset.length; i++) {
            char letter = charset[i];
            for(String str : strs) {
                if (str.charAt(i) != letter) return minStr.substring(0, i);
            }
        }
        return minStr;
    }
}
