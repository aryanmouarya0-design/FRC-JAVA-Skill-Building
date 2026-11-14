package module17;

import java.util.Scanner;

public class exercise1_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your first name : ");
        String fname = sc.next();
        System.out.print("enter your last name : ");
        String lname = sc.next();
        String name = fname.concat(lname);
        System.out.println(name);
        System.out.println(name.replace('a', 'x'));
        System.out.println(name.trim());
        sc.close();
    }
}
