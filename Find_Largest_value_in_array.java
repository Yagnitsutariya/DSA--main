
public class Find_Largest_value_in_array {
    public static int largestss(int number[]){
        int largest = Integer.MIN_VALUE; /// minus infiity
        for(int i=0 ; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {1,2,6,3,5};
        System.out.println("largest in array is"+ largestss(number));
    }
}
