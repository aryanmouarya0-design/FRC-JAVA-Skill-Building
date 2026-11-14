package module16;

import java.util.Scanner;

public class exercise2_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your full name : ");
        String fname = sc.next();
        String lname = sc.next();
        String name = fname + " " + lname;
        System.out.println(name.toUpperCase());
        System.out.print(fname.charAt(0));
        System.out.println(lname.charAt(0));
        sc.close();
    }
}
