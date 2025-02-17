
import java.util.*;

public class Create_string {
    public static void main(String[] args) {
        String str = "abcdefg";
        String stri = new String("abcdfghi");
        Scanner sc =new Scanner(System.in);

        String name ;
        name =sc.nextLine();
        System.out.println(name);

       System.out.println(str.length() +""+ stri+"");
       sc.close();
    }
}
// string are immutable
