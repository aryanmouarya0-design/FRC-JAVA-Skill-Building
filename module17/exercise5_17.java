package module17;

import java.util.Scanner;

public class exercise5_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter student1 name : ");
        String name1 = sc.nextLine();
        System.out.print("enter student2 name : ");
        String name2 = sc.nextLine();
        System.out.print("enter student3 name : ");
        String name3 = sc.nextLine();

        if (name1.compareToIgnoreCase(name2) < 0 && name1.compareToIgnoreCase(name3) < 0) {
            if (name2.compareToIgnoreCase(name3) < 0) {
                System.out.println(name1);
                System.out.println(name2);
                System.out.println(name3);
            } else {
                System.out.println(name1);
                System.out.println(name3);
                System.out.println(name2);
            }
        } else if (name2.compareToIgnoreCase(name1) < 0 && name2.compareToIgnoreCase(name3) < 0) {
            if (name1.compareToIgnoreCase(name3) < 0) {
                System.out.println(name2);
                System.out.println(name1);
                System.out.println(name3);
            } else {
                System.out.println(name2);
                System.out.println(name3);
                System.out.println(name1);
            }
        } else {
            if (name2.compareToIgnoreCase(name1) < 0) {
                System.out.println(name3);
                System.out.println(name2);
                System.out.println(name1);
            } else {
                System.out.println(name3);
                System.out.println(name1);
                System.out.println(name2);
            }
        }
        sc.close();
    }
}
