class Print_overloading {
    void printData(int data) {
        System.out.println("Integer: " + data);
    }
    void printData(double data) {
        System.out.println("Double: " + data);
    }
    void printData(String data) {
        System.out.println("String: " + data);
    }
}
public class printdata {
    public static void main(String[] args) {
        Print_overloading obj = new Print_overloading();
        obj.printData(5);
        obj.printData(3.14);
        obj.printData("Hello, Java!");
    }
}