package module16;

import java.util.Scanner;

public class exercise1_16 {
    public static int index(String str, char ch) {
        return str.indexOf(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string : ");
        String str = sc.nextLine();
        System.out.print("enter the character inside the string : ");
        char ch = sc.next().charAt(0);
        System.out.println(index(str, ch));
        sc.close();
    }
}
