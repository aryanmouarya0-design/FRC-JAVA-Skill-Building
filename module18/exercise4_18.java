package module18;

import java.util.Scanner;

public class exercise4_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the height of the triangle : ");
        int h = sc.nextInt();
        System.out.print("enter the base of the triangle : ");
        int b = sc.nextInt();
        System.out.println("hypotenuse of the triangle is : " + Math.sqrt((h * h) + (b * b)));
        sc.close();
    }
}
