class MaxFinder {
    int max(int a, int b) {
        return (a > b) ? a : b;
    }
    int max(int a, int b, int c) {
        return max(max(a, b), c);
    }
    int max(int a, int b, int c, int d) {
        return max(max(a, b), max(c, d));
    }
    int max(int a, int b, int c, int d, int e) {
        return max(max(a, b, c), max(d, e));
    }
}
public class max_finder {
    public static void main(String[] args) {
        MaxFinder Rohit = new MaxFinder();
        System.out.println("Max of 4 and 7: " + Rohit.max(4, 7));
        System.out.println("Max of 3, 5, 2: " + Rohit.max(3, 5, 2));
        System.out.println("Max of 8, 2, 9, 4: " + Rohit.max(8, 2, 9, 4));
        System.out.println("Max of 10, 20, 30, 40, 50: " + Rohit.max(10, 20, 30, 40, 50));
    }
}