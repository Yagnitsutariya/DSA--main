public class Sum_of_sub_array {
        public static void subarrays(int number[]){
            int cursum= 0;
            int maxSum = Integer.MIN_VALUE;
          for(int i=0; i<number.length; i++){
            for(int j=i; j<number.length ;j++){
               cursum =0;
                for(int k=i; k<=j; k++){
                    cursum = cursum+number[k];
                   
                }
                System.out.println("current sum is"+ cursum);
                if(maxSum < cursum){
                    maxSum = cursum;
                    
                }
                
            }
          }  
          System.out.println("max sum is " + maxSum);
        }
        public static void main(String[] args) {
            int number[] = {1,-1,3,-4,5,6,7,};
            subarrays(number);
        }
    }
    

