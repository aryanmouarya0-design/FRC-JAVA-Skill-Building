package module23;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise5_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of elements : ");
        int n = sc.nextInt();

        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.print("enter the elements : ");
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("enter the elements : ");
        for (int j = 0; j < n; j++) {
            list2.add(sc.nextInt());
        }

        ArrayList<Integer> list3 = new ArrayList<>();
        for (int k = 0; k < n; k++) {
            list3.add(list1.get(k) * list2.get(k));
        }
        System.out.println("product of corresponding elements : " + list3);
        sc.close();
    }
}
