class method_overloading_Calc {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
    int subtract(int a, int b) {
        return a - b;
    }
    double subtract(double a, double b) {
        return a - b;
    }
    int multiply(int a, int b) {
        return a * b;
    }
    double multiply(double a, double b) {
        return a * b;
    }
    int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
    double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0.0;
        }
        return a / b;
    }
}
public class calculator {
    public static void main(String[] args) {
        method_overloading_Calc VIRAT = new method_overloading_Calc();
        System.out.println("Add 5 + 3: " + VIRAT.add(5, 3));
        System.out.println("Add 1 + 2 + 3: " + VIRAT.add(1, 2, 3));
        System.out.println("Add 4.5 + 3.2: " + VIRAT.add(4.5, 3.2));

        System.out.println("Subtract 9 - 4: " + VIRAT.subtract(9, 4));
        System.out.println("Subtract 7.8 - 2.3: " + VIRAT.subtract(7.8, 2.3));

        System.out.println("Multiply 6 * 4: " + VIRAT.multiply(6, 4));
        System.out.println("Multiply 2.5 * 4.0: " + VIRAT.multiply(2.5, 4.0));

        System.out.println("Divide 8 / 2: " + VIRAT.divide(8, 2));
        System.out.println("Divide 9.6 / 3.2: " + VIRAT.divide(9.6, 3.2));
        System.out.println("Divide 5 / 0: " + VIRAT.divide(5, 0));
    }
}