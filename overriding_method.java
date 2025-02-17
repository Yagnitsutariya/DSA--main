package Basic;

public class overriding_method {

    public static void main(String[] args) {
       ani a = new ani();
       a.eatsfg();
       Animals a2 = new Animals();
       a2.eats();
    }
}
 class Animals{
    void eats(){
        System.out.println("animal also eat");
    }
 }
 class ani extends animal{
    void eatsfg(){
        System.out.println("animals is also eat");
    }
 }