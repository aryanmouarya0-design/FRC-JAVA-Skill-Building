package module19;

import java.util.Scanner;

public class exercise2_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("the elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("the sum of the elements is : " + total);
        sc.close();
    }
}
