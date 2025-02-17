public class Inverted_piramid {
    public static void piramid(int n) {
        // Outer loop for printing each row
        for (int i = 1; i <=n; i++) {
            // Inner loop for printing spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // Inner loop for printing stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        piramid(6); // Call the method with n=6
    }
}
