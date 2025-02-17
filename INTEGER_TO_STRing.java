package Recursion_understanding;

public class INTEGER_TO_STRing {
    static String digit[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void stringtoint(int n){
        if(n==0){
            return;
        }
        int lastdigit = n%10;
        stringtoint(n/10);
        System.out.print(digit[lastdigit]+" ");

    }
    public static void main(String[] args) {
       stringtoint(13215);
    }
}
