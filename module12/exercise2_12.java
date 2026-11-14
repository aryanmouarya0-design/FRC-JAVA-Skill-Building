package module12;

public class exercise2_12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            int odd = 2 * i - 1;
            if (odd % 5 == 0) {
                continue;
            }
            System.out.println(odd);
        }
    }
}
