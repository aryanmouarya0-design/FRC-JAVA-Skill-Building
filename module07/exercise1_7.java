package module07;

import java.util.Scanner;

public class exercise1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name : ");
        String name = sc.nextLine();
        System.out.print("enter your age : ");
        String age = sc.nextLine();
        System.out.println("your name is " + name + "\nyour age is " + age);
        sc.close();
    }
}
