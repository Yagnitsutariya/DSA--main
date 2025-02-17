package Recursion_understanding;

public class Friendly__pair {
    public static int pair(int n){
        //base case

        if(n==0 || n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        //for choose single
        int fnm1 = pair(n-1);
        //for choose double
        int fnm2 =  pair(n-2);
        int totalpair = (n-1)*fnm2;

        int totalwayss = fnm1 + totalpair;
        return totalwayss ; 
    }

    public static void main(String[] args) {
        System.out.println(pair(3));
    }
}
