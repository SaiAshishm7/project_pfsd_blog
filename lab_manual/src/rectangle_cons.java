class Rectangle {
    int length;
    int width;

    Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    Rectangle(int side) {
        this.length = side;
        this.width = side;
    }

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int area() {
        return length * width;
    }
}

public class rectangle_cons {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5);
        Rectangle rect3 = new Rectangle(4, 7);

        System.out.println("Area of default rectangle: " + rect1.area());
        System.out.println("Area of square (side 5): " + rect2.area());
        System.out.println("Area of rectangle (4x7): " + rect3.area());
    }
}