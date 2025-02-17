import java.util.*;
public class Palandriam_check {

    public static boolean isPalindrom(int number ){
        int palindrome = number ;
        int reverse =0 ;

        while (palindrome!=0) {
            int remainder = palindrome %10;
            reverse = (reverse*10)+remainder;
            palindrome = palindrome/10;
        }
        if (number==reverse) {
            return true;
            
        
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter a number :");
        int palindrome=sc.nextInt();

        if (isPalindrom(palindrome)) {
            System.out.println("value is palindrome" + palindrome);
            
        }else{
            System.out.println("not palindrome");
        }
    sc.close();
    }
}  
