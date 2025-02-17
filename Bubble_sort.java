
public class Bubble_sort {
    public static void bubble(int arr[]){
        int n = arr.length;

        for(int i=0 ; i<n-1; i++){

            for(int j=0; j<n-1-i; j++){
                //if condition check greter
                if(arr[j]>arr[j+1]){

                    int temp = arr[j];

                    arr[j]=arr[j+1];

                    arr[j+1] =temp;
                }
            }
        }      
    }
    //for print array
    public static  void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    } 
    public static void main(String[] args) {
      int arr[] ={12,53,65,86,22};
      bubble(arr);
      printarr(arr);
    }
}
