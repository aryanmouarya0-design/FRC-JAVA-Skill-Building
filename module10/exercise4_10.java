package module10;

import java.util.Scanner;

public class exercise4_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long product = 1;
        for (int i = 1; i <= num; i++) {
            product *= i;
        }
        System.out.println("the factorial of the number " + num + " is " + product);
        sc.close();
    }
}
