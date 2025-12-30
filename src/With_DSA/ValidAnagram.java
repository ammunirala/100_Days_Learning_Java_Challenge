package With_DSA;

import java.util.Scanner;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();

        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // only count alphabets
            if (c1 < 'a' || c1 > 'z' || c2 < 'a' || c2 > 'z') {
                return false;
            }

            freq[c1 - 'a']++;
            freq[c2 - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        System.out.println("Is Anagram? " + isAnagram(s, t));

        sc.close();
    }

}
