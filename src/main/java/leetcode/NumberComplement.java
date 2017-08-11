package leetcode;
/*
Easy
Given a positive integer, output its complement number.
eg: 5 -> 2 (101 010)
eg: 1 -> 0 (1 0)
Note:
Within the range of a 32-bit signed integer.
 */
public class NumberComplement {
    public static int run(int num) {
        int res = 1 ^ (num & 1);
        int exp = 2;
        while( ( num >>= 1 ) > 0) {
            res += exp * (1 ^ (num & 1));
            exp *= 2;
        }
        return res;
    }
}
