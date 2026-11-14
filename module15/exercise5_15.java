package module15;

public class exercise5_15 {
    public void power(int a, int n) {
        double exp = 1;
        for (int i = 0; i < n; i++) {
            exp *= a;
        }
        System.out.println(n + " raise to " + a + " is " + exp);
    }

    public static void main(String[] args) {
        exercise5_15 power = new exercise5_15();
        power.power(8, 9);
    }
}
