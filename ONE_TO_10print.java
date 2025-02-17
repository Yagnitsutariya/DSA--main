package Recursion_understanding;

public class ONE_TO_10print {
    public static void print(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+ " ");
        print(n-1);
    }
    public static void inc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        inc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 10;
        inc(n);
    }
}