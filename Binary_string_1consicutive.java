package Recursion_understanding;

public class Binary_string_1consicutive {
    public static void printBinary(int n, int lastplace , String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinary(n-1, 0, str+"0");
        if (lastplace==0) {
            printBinary(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printBinary(3, 0,"" );
    }
}
