package module22;

import java.util.ArrayList;

public class exercise2_22 {
    public static void fnArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.remove(2);
        System.out.println("the new list is : " + list);
        System.out.println("the size of new list is : " + list.size());
    }

    public static void main(String[] args) {
        fnArrayList();
    }
}
