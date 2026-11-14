package module18;

import java.util.Scanner;

public class exercise5_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x-coordinate of point1 : ");
        int x1 = sc.nextInt();
        System.out.print("enter y-coordinate of point1 : ");
        int y1 = sc.nextInt();
        System.out.print("enter x-coordinate of point2 : ");
        int x2 = sc.nextInt();
        System.out.print("enter y-coordinate of point2 : ");
        int y2 = sc.nextInt();

        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("distance between the two points is : " + distance);
        sc.close();
    }
}
