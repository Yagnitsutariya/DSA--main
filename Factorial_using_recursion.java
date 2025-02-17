package Recursion_understanding;

public class Factorial_using_recursion {
public static int fact(int n){
    if(n==0){
        return 1;
    }
    int fnm1 = fact(n-1);
    int fn = n * fnm1;
    return fn;
}

//sum of n natural no
public static int sums(int n){
    if(n==1){
        return 1;
    }
    int snminus1 = sums(n-1);
    int sum = snminus1+n;
    return sum;
}
    public static void main(String[] args) {
        int n=5;
        System.out.println(sums(n));
    }
}