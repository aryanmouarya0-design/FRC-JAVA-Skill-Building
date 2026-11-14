package module12;

import java.util.Scanner;

public class exercise1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "FRC12364";

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter password: ");
            String input = sc.nextLine();
            if (input.equals(password)) {
                System.out.println("Access granted.");
                break;
            } else {
                switch (i) {
                    case 0:
                        System.out.println("Incorrect password, try again.");
                        break;
                    case 1:
                        System.out.println("Incorrect password, try again.");
                        break;
                    case 2:
                        System.out.println("Incorrect password, Access denied.");
                        break;
                }
            }
        }

        sc.close();
    }
}
