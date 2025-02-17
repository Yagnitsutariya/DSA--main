

public class String_Bulder {
    public static void main(String[] args) {
        StringBuilder stri = new StringBuilder("");

        for(char ch='a'; ch<='z'; ch++){
            stri.append(ch);
        }
        System.out.print(stri+" ");
    }
}
