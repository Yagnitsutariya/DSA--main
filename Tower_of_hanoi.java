package Recursion_understanding;

public class Tower_of_hanoi {

    public static void towerofHanoi(int n , String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk " +n+" from " + src + "to" + dest);
            return;
        }
        //transfer top n-1 source to helper using destination as a helper
        towerofHanoi(n-1, src, dest, helper);

        System.out.println("transfer disk" +n+ "from" + src +" to " + helper);

        // helper to destination using src as helper
        towerofHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        towerofHanoi(n, "A", "B", "C");
    }
}