 public class linked_list {

    public static class Node {
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
    public static void addFirst(int data) { 
        Node newNode = new Node(data); // Use Node consistently
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int data) { 
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
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
    public static void addinmiddle(int idx, int data){
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0 ;
        
        while (i <idx-1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public static int removefirst(){
        if (size == 0) {
            System.out.println("ll is empty");
        }
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public static int removelast(){
        if (size == 0) {
            System.out.println("ll is empty");
        }
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node priv = head;
        for(int i = 0 ; i< size-2; i++){
            priv = priv.next;
        }
        int val = priv.next.data;
        priv.next = null;
        tail = priv;
        size--;
        return val;
    }
    public static void main(String[] args) {
            addFirst(1);
            addFirst(3);
            addLast(12);
            addinmiddle(1, 23);
            removefirst();
            removelast();
            printList();
            System.out.println(size);
              
    }
}