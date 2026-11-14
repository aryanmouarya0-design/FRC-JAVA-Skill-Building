package module23;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise3_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.print("enter the number of elements : ");
        int n = sc.nextInt();
        System.out.print("enter the elements : ");
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        System.out.print("enter the element you want to search for : ");
        String searchElement = sc.next();
        boolean result = list.contains(searchElement);

        if (result) {
            System.out.println("element found");
            int index = list.indexOf(searchElement);
            System.out.print("enter the new element to replace it with : ");
            String newElement = sc.next();
            list.set(index, newElement);
            System.out.println("element is replaced");
        } else {
            System.out.println("element not found");
        }
        sc.close();
    }
}
