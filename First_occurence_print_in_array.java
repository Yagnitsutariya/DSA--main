package Recursion_understanding;

public class First_occurence_print_in_array {
    public static int firstOccurence(int arr[], int target ,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return firstOccurence(arr, target, i+1);
    }

    //now we check last occurence
    public static int lastOccurence(int arr[], int target ,int i){
        if(i==arr.length){
            return -1;
        }
        int found =lastOccurence(arr, target, i+1);
        if(found==-1&&arr[i]==target){
            return i;
        }
        return found;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,5,6,7};
        System.out.println(firstOccurence(arr, 5, 0));
        System.out.println(lastOccurence(arr, 10, 0));
    }
}
