package Basic;

public class AbstractClass_making {
    public static void main(String[] args) {
        horse h = new horse();
        h.walk();
        System.out.println(h.color);
        
    }
}
// we can not make object of abstact class but make a constructor of that class
abstract class  Animal{
    String color;
    Animal(){
        color = "brown";
    }
    void eateria(){
        //here color not chanaged beacuse first called parent class constructor and its color is brown so brown color are print  
        color="dark brown";
        System.out.println("animal is eat");
    }
    abstract void walk(); // its provide idea to child class 
}
class horse extends Animal{
    void walk(){ // that idea implementtion is here
        System.out.println("horse walk on four leg");
    }
}
  class chicken extends Animal{
    void walk(){
        System.out.println("color is yellow");
    }
}