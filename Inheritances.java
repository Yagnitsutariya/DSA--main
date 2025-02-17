package Basic;

public class Inheritances {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat();
    }
}

class animal {
    String color;

    void eat(){
        System.out.println("eat");
    }
    void breadth(){
        System.out.println("can breadht");
    }
}

class fish extends animal{
    int fins;

    void swim(){
        System.out.println();
    }
}
