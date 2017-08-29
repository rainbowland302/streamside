package leetcode;


public class ReverseWords {
    public static String run(String s) {
        String[] wordArr = s.split(" ");
        StringBuilder reverseStr = new StringBuilder();
        for(String word: wordArr) {
            StringBuffer reverse = new StringBuffer(word).reverse();
            reverseStr.append(" ").append(reverse);
        }
        return reverseStr.toString().trim();
    }

    // String & StringBuild are all not primary types
    // primary type in Java: boolean, byte, char, short, int, long, float, double, void
    // However String is mutant which behaves like js out of box.
    public static void callByValue(String s, StringBuilder sb) {
        s = "Changed";
        sb.append("Changed");
    }
}
