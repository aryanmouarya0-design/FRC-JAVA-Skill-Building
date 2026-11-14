package module23;

import java.util.ArrayList;

public class exercise4_23 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("ball");
        list.add("cat");
        list.add("dog");
        list.add("elephant");
        list.add("fan");

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).substring(0, 1).toUpperCase() + list.get(i).substring(1));
        }
        System.out.println("capitalized list" + list);
    }
}
