package Recursion_understanding;

public class power {
    public static double pow(double x, int n) {
        // Base case: n is 0
        if (n == 0) {
            return 1.0;
        }
        // If n is negative, convert the problem to positive exponent
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        // Recursive case: n is positive
        double half = pow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(2.00000, 10));  // Output: 1024.00000
    }
}
