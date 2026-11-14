package module20;

import java.util.Scanner;

public class exercise5_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements : ");
        int n = sc.nextInt();
        System.out.print("enter the number of digits in each element : ");
        int digits = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * Math.pow(10, digits));
        }
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("the sum of the elements is : " + total);
        sc.close();
    }
}
