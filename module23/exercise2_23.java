package module23;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise2_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("enter the elements : ");
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("reversed list is : ");
        ArrayList<Integer> Rlist = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            Rlist.add(list.get(9 - j));
        }
        System.out.println(Rlist);
        sc.close();
    }
}
