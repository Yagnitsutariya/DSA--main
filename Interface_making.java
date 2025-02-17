package Basic;

public class Interface_making {
    public static void main(String[] args) {
        Queen q  = new Queen();
        q.moves();
    }
}

interface chees{
    void moves();
}

class Queen implements chees{
    public void moves(){
        System.out.println("right, left, up, down");
    }
}

class king implements chees{
    public void moves(){
        System.out.println("right, left, up, down, diagonal by one");
    }
}