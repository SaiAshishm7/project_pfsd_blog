class test1{
    int a;
    public int b;
    private int c;

    void setc(int i){
        c=i;
    }
    int getc(){
        return c;
    }
}
public class test {
    public static void main(String[] args) {
        test1 obj = new test1();
        obj.a = 10;
        obj.b = 20;
        obj.setc(100);
        System.out.println("a,b,c = "+obj.a + " " + obj.b+" "+obj.getc());
    }
}
