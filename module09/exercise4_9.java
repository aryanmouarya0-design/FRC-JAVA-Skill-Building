package module09;

import java.util.Scanner;

public class exercise4_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of first side : ");
        int side1 = sc.nextInt();
        System.out.print("enter the length of second side : ");
        int side2 = sc.nextInt();
        System.out.print("enter the length of third side : ");
        int side3 = sc.nextInt();

        boolean valid = (side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2);
        String result = valid ? "The triangle is valid." : "The triangle is not valid.";
        System.out.println(result);

        sc.close();
    }
}
