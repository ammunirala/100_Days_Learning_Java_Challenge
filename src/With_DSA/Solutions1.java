package With_DSA;

public class Solutions1 {

    // LeetCode wala method
    public int countConsistentStrings(String allowed, String[] words) {

        boolean[] present = new boolean[26];

        for (char c : allowed.toCharArray()) {
            present[c - 'a'] = true;
        }

        int count = 0;

        for (String word : words) {
            boolean isConsistent = true;

            for (char c : word.toCharArray()) {
                if (!present[c - 'a']) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) {
                count++;
            }
        }
        return count;
    }

    // 🔥 MAIN METHOD (IntelliJ run ke liye)
    public static void main(String[] args) {

        Solutions1 sol = new Solutions1();

        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};

        int result = sol.countConsistentStrings(allowed, words);

        System.out.println("Consistent Strings Count = " + result);
    }
}
