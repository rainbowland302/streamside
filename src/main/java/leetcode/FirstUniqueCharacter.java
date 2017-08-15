package leetcode;

/*
Easy
Given a string, find the first non-repeating character in it and return it's index.
If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
*/


public class FirstUniqueCharacter {
    public static int run(String s) {
        char[] charset = s.toCharArray();
        for(int i = 0; i < s.length(); i++)
        {
            char c = charset[i];
            if(s.indexOf(c) == s.lastIndexOf(c))
            {
                return i;
            }
        }
        return -1;
    }
}

