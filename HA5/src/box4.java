class Box6{
    double width;
    double height;
    double depth;
    Box6(double w, double h, double d) {
        width=w;
        height=h;
        depth=d;
    }
    Box6() {
        System.out.println("Construction Box");
        width=-1;
        height=-1;
        depth=-1;
    }
    Box6(double len){
        width=height=depth=len;
    }
    double volume() {
        return width*height*depth;
    }
}
public class box4 {
    public static void main(String[] args) {
        Box6 mybox1 =new Box6(10,20,15);
        Box6 mybox2 = new Box6();
        Box6 mycube = new Box6(7);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);

        vol = mycube.volume();
        System.out.println("Volume is " + vol);
    }
}