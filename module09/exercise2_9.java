package module09;

import java.util.Scanner;

public class exercise2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age : ");
        int age = sc.nextInt();
        String result;

        if (age <= 0) {
            result = "Invalid input";
        } else if (age < 18) {
            result = "Minor";
        } else {
            result = "Adult";
        }

        switch (result) {
            case "Invalid input":
                System.out.println("Error: Please enter a valid age.");
                break;
            case "Minor":
                System.out.println("You are a minor.");
                break;
            case "Adult":
                System.out.println("You are an adult.");
                break;
            default:
                break;
        }
        sc.close();
    }
}
