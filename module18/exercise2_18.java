package module18;

import java.util.Scanner;

public class exercise2_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        System.out.println("select an option (enter the number) : \n1.calculate area of circle \n2.calculate area of square \n3.calculate area of rectangle \n4.exit ");

        while (run) {
            System.out.print("enter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("enter the radius of circle : ");
                    float radius = sc.nextFloat();
                    System.out.println("area of circle is : " + 3.14 * radius * radius);
                    break;
                case 2:
                    System.out.print("enter the side of square : ");
                    float side = sc.nextFloat();
                    System.out.println("area of square is : " + side * side);
                    break;
                case 3:
                    System.out.print("enter the length of rectangle : ");
                    float length = sc.nextFloat();
                    System.out.print("enter the breadth of rectangle : ");
                    float breadth = sc.nextFloat();
                    System.out.println("area of rectangle is : " + length * breadth);
                    break;
                case 4:
                    System.out.print("the program is end now");
                    run = false;
                    break;
                default:
                    System.out.println("invalid choice");
                    run = false;
                    break;
            }
        }
        sc.close();
    }
}
