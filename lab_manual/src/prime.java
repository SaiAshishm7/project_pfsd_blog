public class prime {
    public static void main(String[] args) {
        int n = 200;

        // Print prime numbers up to n
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            if (i == 2) {
                // 2 is the only even prime number
                isPrime = true;
            } else if (i % 2 == 0) {
                // All other even numbers are not prime
                isPrime = false;
            } else {
                // Check for factors from 3 to the square root of i
                for (int j = 3; j * j <= i; j += 2) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}