import java.util.Stack;

public class Palindrome_Linked_List_usig_stack {
    class  Node {
        int data;
        Node ptr;

        Node(int data) {
            this.data = data;
            this.ptr = null;
        }
    }

    public static class Solution {
        static boolean isPalindrome(Node head) {
            Node slow = head;
            boolean isPalim = true;
            Stack<Integer> s = new Stack<>();

            while (slow != null) {
                s.push(slow.data);
                slow = slow.ptr;
            }

            while (head != null) {
                int i = s.pop();
                if (head.data == i) {
                    // No need for empty block
                } else {
                    isPalim = false;
                    break;
                }
                head = head.ptr;
            }
            return isPalim;
        }
    }

    public static void main(String[] args) {
        Palindrome_Linked_List_usig_stack outer = new Palindrome_Linked_List_usig_stack(); // Create an instance
        Solution sol = outer.new Solution(); //create an instance of the inner class.

        Node head1 = outer.new Node(1);
        head1.ptr = outer.new Node(2);
        head1.ptr.ptr = outer.new Node(2);
        head1.ptr.ptr.ptr = outer.new Node(1);

        System.out.println("Is palindrome: " + sol.isPalindrome(head1));

        Node head2 = outer.new Node(1);
        head2.ptr = outer.new Node(2);
        head2.ptr.ptr = outer.new Node(3);

        System.out.println("Is palindrome: " + sol.isPalindrome(head2));

        Node head3 = outer.new Node(1);
        System.out.println("Is palindrome: " + sol.isPalindrome(head3));

        Node head4 = outer.new Node(1);
        head4.ptr = outer.new Node(1);
        System.out.println("Is palindrome: " + sol.isPalindrome(head4));

        Node head5 = outer.new Node(1);
        head5.ptr = outer.new Node(2);
        System.out.println("Is palindrome: " + sol.isPalindrome(head5));
    }
}