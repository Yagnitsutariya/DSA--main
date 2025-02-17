public class Insertition {
    public static void insert(int arr[]) {
        for (int i = 1; i < arr.length; i++) { // Error: should be i < arr.length, not i < arr.length - 1
            int curr = arr[i]; // Error: should be arr[i], not i
            int previous = i - 1; // Typo: 'privious' should be 'previous'
            while (previous >= 0 && arr[previous] > curr) {
                arr[previous + 1] = arr[previous];
                previous--;
            }
            arr[previous + 1] = curr;
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {12,23,45,67};
        insert(arr);
        print(arr);
    }
}