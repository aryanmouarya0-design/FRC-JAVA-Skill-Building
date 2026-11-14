package module16;

import java.util.Scanner;

public class exercise3_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the sentence : ");
        String sentence = sc.nextLine();
        System.out.print("enter the word : ");
        String word = sc.next();

        if (sentence.indexOf(word) >= 0) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
        sc.close();
    }
}
