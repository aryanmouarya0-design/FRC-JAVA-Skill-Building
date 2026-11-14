package module14;

public class exercise3_14 {
    public static void isPrime(int N) {
        if (N <= 1) {
            System.out.println(false);
            return;
        }
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }

    public static void main(String[] args) {
        isPrime(7);
        isPrime(10);
    }
}
