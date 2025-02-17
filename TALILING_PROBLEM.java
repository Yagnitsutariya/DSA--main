package Recursion_understanding;

public class TALILING_PROBLEM {
    public static int tiles(int n){
        if(n==0 || n==1){
            return 1;
        }
        // for verticle
        int vnm1 = tiles(n-1);

        // for horizontal
        int hnm2 = tiles(n-2);

        int totalways = vnm1+hnm2;
        return totalways;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(tiles(n));
    }
}