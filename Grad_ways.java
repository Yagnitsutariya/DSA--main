public class Grad_ways {
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
    public static int numberOfWays(int m, int n) {
        // The number of ways to traverse the grid is (m+n-2)! / ((m-1)! * (n-1)!)
        return factorial(m + n - 2) / (factorial(m - 1) * factorial(n - 1));
    }

    public static void main(String[] args) {
        int m = 10; // Number of rows
        int n = 10; // Number of columns
        System.out.println("Number of ways to traverse the grid: " + numberOfWays(m, n));
    }
}
