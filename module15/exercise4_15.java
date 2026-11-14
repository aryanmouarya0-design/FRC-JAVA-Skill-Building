package module15;

import java.util.Scanner;

public class exercise4_15 {
    public static void printtable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public void checkPrime(int num) {
        if (num <= 1) {
            System.out.println(false);
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        System.out.println("select an option \n1.print a table \n2.check prime \n3.exit ");

        while (run) {
            System.out.print("enter your choice : ");
            int choice = sc.nextInt();
            if (choice < 1 || choice > 3) {
                System.out.println("invalid choice");
            } else {
                switch (choice) {
                    case 1:
                        System.out.print("enter the number : ");
                        int num1 = sc.nextInt();
                        printtable(num1);
                        break;
                    case 2:
                        System.out.print("enter the number : ");
                        int num2 = sc.nextInt();
                        exercise4_15 cp = new exercise4_15();
                        cp.checkPrime(num2);
                        break;
                    case 3:
                        System.out.print("the program is end now");
                        run = false;
                        break;
                }
            }
        }
        sc.close();
    }
}
