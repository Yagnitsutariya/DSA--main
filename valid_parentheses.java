import java.util.Stack;

public class valid_parentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if ((stack.peek() == '(' && ch == ')') ||
                    (stack.peek() == '{' && ch == '}') ||
                    (stack.peek() == '[' && ch == ']')) {
                    stack.pop(); // Pop the matching opening bracket
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty(); // Check if the stack is empty at the end
    }
}