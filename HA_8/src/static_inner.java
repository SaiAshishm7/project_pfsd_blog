class outerclass1{
    static String staticmessage = "hello from outerclass1";

    static class staticnestedclass{
        void display(){
            System.out.println(staticmessage);
        }
    }
}


public class static_inner {
    public static void main(String[] args) {
        outerclass1.staticnestedclass nested = new outerclass1.staticnestedclass();

        nested.display();
    }
}
