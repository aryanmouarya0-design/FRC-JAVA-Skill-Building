package module20;

import java.util.Scanner;

public class exercise4_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                System.out.println("the sum of index " + i + " and " + (n - i - 1) + " is : " + (arr[i] + arr[n - i - 1]));
            }
        } else {
            for (int i = 0; i < n / 2; i++) {
                System.out.println("the sum of index " + i + " and " + (n - i - 1) + " is : " + (arr[i] + arr[n - i - 1]));
            }
            System.out.println("the middle element is : " + arr[n / 2]);
        }
        sc.close();
    }
}
