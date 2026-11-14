package module17;

import java.util.Scanner;

public class exercise2_17 {
    public static void main(String[] args) {
        System.out.print("enter a string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        sc.close();
    }
}
