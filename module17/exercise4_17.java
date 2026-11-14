package module17;

import java.util.Scanner;

public class exercise4_17 {
    public static void main(String[] args) {
        String user = "Student123";
        String pass = "AbCdef";
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the username : ");
        String inuser = sc.nextLine();
        System.out.print("enter the passwowd : ");
        String inpass = sc.nextLine();

        String usercheck = (user.equalsIgnoreCase(inuser)) ? "correct username" : "incorrect username";
        System.out.println(usercheck);
        String passcheck = (pass.equals(inpass)) ? "correct password" : "incorrect password";
        System.out.println(passcheck);

        sc.close();
    }
}
