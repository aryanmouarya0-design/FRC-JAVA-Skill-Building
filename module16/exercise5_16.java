package module16;

import java.util.Scanner;

public class exercise5_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string: ");
        String str = sc.nextLine();
        System.out.println("last indes of e is " + str.lastIndexOf('e'));
        String start = str.startsWith("The") ? "yes, it starts with \"The\" " : "no, it dont start with \"The\" ";
        System.out.println(start);
        String end = str.endsWith("end") ? "yes, it ends with \"end\" " : "no, it dont end with \"end\" ";
        System.out.println(end);
        sc.close();
    }
}
