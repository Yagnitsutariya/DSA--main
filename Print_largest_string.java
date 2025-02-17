public class Print_largest_string {
public static void main(String[] args) {
    String[] strings = {"apple", "banana", "cherry", "date"};
    String largest = strings[0];

    for (String str : strings) {
        if (largest.compareTo(str) <0) {
            largest = str;
        }
    }

    System.out.println("The largest string is: " + largest);
}
}