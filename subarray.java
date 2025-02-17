public class subarray {
    public static void subarrays(int number[]){
      for(int i=0; i<number.length; i++){
        for(int j=i; j<number.length ;j++){
           
            for(int k=i; k<=j; k++){
                System.out.print(number[k]);
            }
            System.out.println();
        }
      }  
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6,7,};
        subarrays(number);
    }
}
