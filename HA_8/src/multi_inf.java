interface movable{
    void move();
}
interface chargeable{
    void charge();
}

class electrical implements movable{
    public void move(){
        System.out.println("electrical move");
    }

    public void charge(){
        System.out.println("electrical charge");
    }
}

public class multi_inf {
    public static void main(String[] args) {
        electrical e = new electrical();
        e.move();
        e.charge();
    }
}
