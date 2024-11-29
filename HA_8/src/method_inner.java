class outerclass{
    void mymethod(){
        final String method = "mymethod";

        class methodinnerclass{
            void display(){
                System.out.println(method);
            }
        }
        methodinnerclass obj = new methodinnerclass();
        obj.display();
    }
}

public class method_inner {
    public static void main(String[] args) {
        outerclass obj = new outerclass();
        obj.mymethod();
    }
}
