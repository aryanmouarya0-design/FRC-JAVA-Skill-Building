package module09;

import java.util.Scanner;

public class exercise1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number : ");
        float num1 = sc.nextFloat();
        System.out.print("enter the second number : ");
        float num2 = sc.nextFloat();
        System.out.print("enter the operator(+, -, *, /) : ");
        char operator = sc.next().charAt(0);
        float result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    result = Float.NaN;
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                result = Float.NaN;
                System.out.println("invalid operator");
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        sc.close();
    }
}
