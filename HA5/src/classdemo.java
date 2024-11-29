class Box2{
    double width;
    double height;
    double depth;
    double volume() {
        return width*height*depth;
    }
}
public class classdemo{
    public static void main(String[] args){
        Box2 mybox1 =new Box2();
        Box2 mybox2 = new Box2();
        double vol;
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}