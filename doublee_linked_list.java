public class doublee_linked_list {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void addfirst(int data){
        Node newnode = new Node(data);
        size ++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode; 
    }
    public static void addlast(int data){
        Node newnnode = new Node(data);
        size ++;
        if(head == null){
            head = tail =newnnode;
        } 
        tail.next = newnnode;
        newnnode.prev = tail;
        tail = newnnode;
    }
    public static int deletfirst(int data){
        if(head != null){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size -- ;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev =null;
        size --;
        return val; 
    }
    public void print(){
        Node temp =head;
        while (temp != null) {
            System.out.print(temp.data+"<->");
        }
        System.out.print("null");
    }
}
