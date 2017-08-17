package leetcode;

/*
Easy
Recursion
Write a function that sums all numbers in an array that can have nested sub-arrays.
*/

public class SumNestedArray {
    public static int run(Object[] arr) {
        int res = 0;
        for (Object anArr : arr) {
            if (anArr instanceof Object[]) res += run((Object[]) anArr);
            else res += (Integer) anArr;
        }
        return res;
    }
}

