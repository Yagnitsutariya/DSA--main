public class Making_Substring {
    public static String substring(String str , int st,int ei){
        String substr ="";
        for(int i=st; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;

    }
    public static void main(String[] args) {
        String str = "hello babay";
        System.out.println(substring(str, 0, 5));
    }
}
