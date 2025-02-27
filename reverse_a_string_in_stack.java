import java.util.Stack;

public class reverse_a_string_in_stack {
public static String reverseString(String str) {
    Stack <Character> s = new Stack<>();
    int idx = 0;
    while (idx< str.length()) {
        s.push(str.charAt(idx));
        idx++;
    }
    StringBuilder result = new StringBuilder("");
    while (!s.isEmpty()) {
        char curr = s.pop();
        result.append(curr);          
    }
    return result.toString();
}

public static void main(String[] args) {
    String input = "Hello, World!";
    String reversed = reverseString(input);
    System.out.println("Reversed string: " + reversed);
}
}