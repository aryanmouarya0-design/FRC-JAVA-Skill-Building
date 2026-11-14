package module14;

import java.util.Scanner;

public class exercise1_14 {
    public static void factorial(int num) {
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        } else if (num == 0) {
            System.out.println("The factorial of 0 is: 1");
            return;
        } else {
            int i = 1;
            long product = 1;
            while (i <= num) {
                product *= i;
                i++;
            }
            System.out.println("The factorial of " + num + " is: " + product);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        factorial(num);
        sc.close();
    }
}
