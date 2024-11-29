class Area_Calc {
    int area(int length, int width) {
        return length * width;
    }
    int area(int side) {
        return side * side;
    }
    double area(double radius) {
        return Math.PI * radius * radius;
    }
}
public class areacalculator {
    public static void main(String[] args) {
        Area_Calc shape = new Area_Calc();
        System.out.println("Area of rectangle (5x10): " + shape.area(5, 10));
        System.out.println("Area of square (7x7): " + shape.area(7));
        System.out.println("Area of circle (radius 4.5): " + shape.area(4.5));
    }
}