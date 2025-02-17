package Recursion_understanding;

public class print_occurences {
    public static void allocurrence(int key, int arr[], int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]== key){
            System.out.print(i);
        }
    allocurrence(key, arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,34,33,2,23,3,2};
        allocurrence(2, arr, 0);
    }
}
