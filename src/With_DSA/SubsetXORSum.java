package With_DSA;
public class SubsetXORSum {


    public static int subsetXORSum(int[] numbs) {
        return dfs(numbs, 0, 0);
    }


    private static int dfs(int[] numbs, int index, int xor) {


        if (index == numbs.length) {
            return xor;
        }


        int include = dfs(numbs, index + 1, xor ^ numbs[index]);


        int exclude = dfs(numbs, index + 1, xor);

        return include + exclude;
    }


    public static void main(String[] args) {

        int[] numbs = {1, 3};

        int result = subsetXORSum(numbs);

        System.out.println("Sum of all subset XOR totals = " + result);
    }
}
