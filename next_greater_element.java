import java.util.Stack;

public class next_greater_element {
    public static int[] nextGreaterElement(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int[] nextgrete = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= nums[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextgrete[i] = -1;
            } else {
                nextgrete[i] = s.peek();
            }

            s.push(nums[i]);
        }

        return nextgrete;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 25};
        int[] result = nextGreaterElement(nums);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}