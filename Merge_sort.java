public class Merge_sort {
    public static void print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesort(int arr[], int si, int ei ){
        if(si>=ei){
            return;
        }
        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr , si ,mid,ei);
    }
    public static void merge(int arr[],int si, int mid, int ei){
       int temp[] = new int[ei-si+1];
       int i = si; // start //left
       int j = mid+1; // mid +1 //right
       int k = 0; //for temp

       while(i<=mid && j<=ei){
        if(arr[i]<=arr[j]){
            temp[k] = arr[i];
            i++;
        }else{
            temp[k] = arr[j];
            j++;
        }
        k++;
       }

       // Copy remaining elements of left half, if any
       while(i<=mid){
        temp[k++] = arr[i++];
       }
       // Copy remaining elements of right half, if any
       while (j<=ei) {
        temp[k++] = arr[j++];
       }
       // Copy sorted elements back to original array
       for(k=0, i = si; k<temp.length; k++,i++){
        arr[i]= temp[k];
       }
    }
    public static void main(String[] args) {
        int arr[] = {3,1,4,6,3,6,8};
        mergesort(arr, 0, arr.length-1);
        print(arr);
    }
}