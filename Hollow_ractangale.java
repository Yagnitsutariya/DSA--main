public class Hollow_ractangale {

    public static void Hollowractangle(int totlrow, int totlcol){
        //for outer loop row
        for(int i=1; i<=totlrow; i++ ){
            // inner loop for col 
            for(int j=1;j<=totlcol; j++ ){
                if(i==1||i==totlrow||j==1||j==totlcol){
                    System.out.print("*");
                }
                else
                {
                System.out.print(" ");
                }
               
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       Hollowractangle(5,5);
    }
}

