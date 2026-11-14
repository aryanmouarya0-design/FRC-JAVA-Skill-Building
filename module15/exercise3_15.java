package module15;

public class exercise3_15 {
    public void sumOfDigits(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        exercise3_15 sod = new exercise3_15();
        sod.sumOfDigits(67);
    }
}
