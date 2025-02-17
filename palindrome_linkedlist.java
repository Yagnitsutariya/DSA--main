public class palindrome_linkedlist {
    public static class Node{
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void addfirst(int data ){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return ;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node findmiddle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(Node head) {
        if(head == null || head.next == null){
            return true;
        }
        // find middle 
        Node mid = findmiddle(head);

        // reverse second half
        Node prev = null;
        Node curr = mid;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
            Node right = prev;
            Node left = head;

            // check left is equal to right
            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }

            return true;
    }
}
