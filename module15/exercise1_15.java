package module15;

import java.util.Scanner;

public class exercise1_15 {
    public void printFibonacci(int count) {
        if (count <= 0) {
            System.out.println("Please enter a positive count.");
            return;
        }
        int first = 0;
        int second = 1;
        System.out.print("First " + count + " Fibonacci numbers: ");
        for (int i = 1; i <= count; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of Fibonacci numbers to print: ");
        int count = sc.nextInt();
        exercise1_15 fib = new exercise1_15();
        fib.printFibonacci(count);
        sc.close();
    }
}
