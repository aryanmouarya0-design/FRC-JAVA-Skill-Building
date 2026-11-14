package module18;

import java.util.Scanner;

public class exercise1_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        float num1 = sc.nextFloat();
        System.out.print("enter second number : ");
        float num2 = sc.nextFloat();
        System.out.print("enter third number : ");
        float num3 = sc.nextFloat();

        float max = Math.max(num1, Math.max(num2, num3));
        float min = Math.min(num1, Math.min(num2, num3));

        System.out.println("maximum is " + max);
        System.out.println("minimum is " + min);

        sc.close();
    }
}
