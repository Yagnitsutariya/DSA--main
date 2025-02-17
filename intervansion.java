public class intervansion {
    public static int mergesort(int arr[], int si, int ei) {
        int invcount = 0;
        if (si < ei) {
            int mid = si + (ei - si) / 2;
            invcount += mergesort(arr, si, mid);
            invcount += mergesort(arr, mid + 1, ei);
            invcount += merge(arr, si, mid, ei);
        }
        return invcount;
    }

    public static int merge(int arr[], int left, int mid, int right) {
        int invcount = 0;
        int temp[] = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invcount += (mid + 1 - i); // Count inversions
            }
        }

        // Copy remaining elements of left subarray, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of right subarray, if any
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy sorted elements back to original array
        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }

        return invcount;
    }

    public static int intervansions(int arr[]) {
        int n = arr.length;
        return mergesort(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        System.out.println("inversion count: " + intervansions(arr));
    }
}