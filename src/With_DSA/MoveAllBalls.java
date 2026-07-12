package With_DSA;

import java.util.Arrays;

public class MoveAllBalls {

    public static int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        int balls = 0;
        int operations = 0;

        // Left to Right pass
        for (int i = 0; i < n; i++) {
            answer[i] += operations;
            if (boxes.charAt(i) == '1') {
                balls++;
            }
            operations += balls;
        }

        // Right to Left pass
        balls = 0;
        operations = 0;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] += operations;
            if (boxes.charAt(i) == '1') {
                balls++;
            }
            operations += balls;
        }

        return answer;
    }

    // 🔥 MAIN METHOD (important)
    public static void main(String[] args) {
        String boxes = "110";
        int[] result = minOperations(boxes);

        System.out.println(Arrays.toString(result));
    }
}
