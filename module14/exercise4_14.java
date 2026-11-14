package module14;

import java.util.Scanner;

public class exercise4_14 {
    public static void countDigits(int num) {
        String str = num + "";
        int strlen = str.length();
        System.out.println("The number of digits in " + num + " is: " + strlen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        countDigits(num);
        sc.close();
    }
}
