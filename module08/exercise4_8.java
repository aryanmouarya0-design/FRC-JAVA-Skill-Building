package module08;

import java.util.Scanner;

public class exercise4_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your marks (out of 100) : ");
        float marks = sc.nextFloat();

        if (marks >= 90 && marks <= 100) {
            System.out.println("your grade is A");
        } else if (marks >= 75 && marks < 90) {
            System.out.println("your grade is B");
        } else if (marks >= 50 && marks < 75) {
            System.out.println("your grade is C");
        } else if (marks >= 0 && marks < 50) {
            System.out.println("your grade is D");
        } else {
            System.out.println("invalid marks");
        }

        sc.close();
    }
}
