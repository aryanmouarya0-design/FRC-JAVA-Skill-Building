package module23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercise1_23 {
    public static int frequency(ArrayList<Integer> list, int element) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("enter 10 elements : ");
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int val = sc.nextInt();
            list.add(val);
            sum += val;
        }

        Collections.sort(list);

        double mean = (double) sum / 10;
        double median = (list.get(4) + list.get(5)) / 2.0;

        int modeVal = list.get(0);
        int maxFreq = frequency(list, modeVal);

        for (int j = 1; j < 10; j++) {
            int currentFreq = frequency(list, list.get(j));
            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                modeVal = list.get(j);
            }
        }

        System.out.println("sum of elements : " + sum);
        System.out.println("mean of elements : " + mean);
        if (maxFreq > 1) {
            System.out.println("mode of elements : " + modeVal);
        } else {
            System.out.println("there is no mode in the list");
        }
        System.out.println("median of elements : " + median);

        sc.close();
    }
}
