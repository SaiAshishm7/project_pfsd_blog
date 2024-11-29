class Rectangle {
    // Member variables to store the length and width of the rectangle
    int length;
    int width;

    // Default constructor
    // Initializes the rectangle with default dimensions (1x1)
    Rectangle() {
        this.length = 1; // Default length
        this.width = 1;  // Default width
    }

    // Constructor with one parameter
    // Initializes the rectangle as a square with equal length and width
    Rectangle(int side) {
        this.length = side;
        this.width = side;
    }

    // Constructor with two parameters
    // Initializes the rectangle with the specified length and width
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    int area() {
        return length * width; // Return the product of length and width
    }
}

// Define the main class that contains the main method
public class rectangle_cons {

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Create instances of the Rectangle class using different constructors
        Rectangle rect1 = new Rectangle();        // Default rectangle (1x1)
        Rectangle rect2 = new Rectangle(5);       // Square with side length 5
        Rectangle rect3 = new Rectangle(4, 7);    // Rectangle with length 4 and width 7

        // Print the area of each rectangle
        System.out.println("Area of default rectangle: " + rect1.area()); // Output: 1
        System.out.println("Area of square (side 5): " + rect2.area());   // Output: 25
        System.out.println("Area of rectangle (4x7): " + rect3.area());    // Output: 28
    }
}