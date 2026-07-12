package With_DSA;

public class Solution {

    public static int scoreOfString(String s) {
        int score = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }

        return score;
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "zaz";

        System.out.println(scoreOfString(s1)); // Output: 13
        System.out.println(scoreOfString(s2)); // Output: 50
    }
}
