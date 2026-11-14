package module16;

import java.util.Scanner;

public class exercise4_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a word: ");
        String word = sc.next();
        int n = word.length();
        System.out.print(word.substring(0, n / 2).toUpperCase());
        System.out.println(word.substring(n / 2).toLowerCase());
        sc.close();
    }
}
