

public class Concatenate_of_string {
    public static void characterat(String fullname){
        for(int i =0; i<fullname.length(); i++){
            System.out.print(fullname.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String firstname = new String("yagnit");
        String lastname = new String("sutariya");
        String fullname = (lastname+" "+ firstname);
        // we can find character at index
        System.out.println(fullname.charAt(4));
        characterat(fullname);
    }
}
