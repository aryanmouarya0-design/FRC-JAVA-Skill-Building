package module22;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise1_22 {
    static Scanner sc = new Scanner(System.in);

    public static void fnArrayList(ArrayList<String> list) {
        System.out.print("enter first name : ");
        String name1 = sc.nextLine();
        list.add(name1);
        System.out.print("enter second name : ");
        String name2 = sc.nextLine();
        list.add(name2);
        System.out.print("enter third name : ");
        String name3 = sc.nextLine();
        list.add(name3);

        System.out.print("enter the index of element to remove : ");
        int index = sc.nextInt();
        list.remove(index);
        System.out.println("the updated list is : " + list);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        fnArrayList(list);
        sc.close();
    }
}
