package module17;

import java.util.Scanner;

public class exercise3_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string : ");
        String str = sc.nextLine();
        int strlen = str.length();
        boolean check = true;

        for (int i = 0; i < strlen / 2; i++) {
            if (str.charAt(i) != str.charAt(strlen - 1 - i)) {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("entered string is a pallindrome");
        } else {
            System.out.println("entered string is not a pallindrome");
        }
        sc.close();
    }
}
