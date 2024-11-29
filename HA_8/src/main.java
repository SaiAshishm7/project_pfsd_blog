interface flyable{
    void fly();
}

class bird implements flyable{
    public void fly(){
        System.out.println("bird fly");
    }
}

public class main {
    public static void main(String[] args) {
        flyable bird = new bird();
        bird.fly();
    }
}
