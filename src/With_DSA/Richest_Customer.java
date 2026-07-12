package With_DSA;

public class Richest_Customer {

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        // Loop through each customer
        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;

            // Loop through each bank of customer
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }

            // Update maximum wealth
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }

        return maxWealth;
    }

    // Main method for IntelliJ execution
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };

        System.out.println("Richest Customer Wealth = " + maximumWealth(accounts));
    }
}
