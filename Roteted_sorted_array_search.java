

public class Roteted_sorted_array_search {
    public static int search(int arr[], int target,int si, int ei){
        if(si>ei){
            return-1;
        }
        int mid = si+(ei-si)/2;

        //case found
        if(arr[mid]==target){
            return mid;
        }

        //MID ON L1
        if(arr[si]<=arr[mid]){
            //CASE 1 FIND IN LEFT

            if(arr[si]<=target&& target<=arr[mid]){
                return search(arr, target, si, mid-1);
            }else{
                //CASE 2 FIND IN RIGHT
                return search(arr, target, mid+1, ei);
            }
        }
        // MID ON L2
        else{
            if(arr[mid]<=target && target <= arr[ei]){
                return search(arr, target, mid+1, ei);
            }else{
                //case 4 left search
                return search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,6,7,0,1,2,3};
        int target = 0;
        int TargetIndex = search(arr, target, 0, arr.length);
        System.out.println(TargetIndex);
    }
}
