package module20;

import java.util.Scanner;

public class exercise1_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of elements in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the first element: ");
        arr[0] = sc.nextInt();
        int i = 1;
        while (i < n) {
            arr[i] = 2 * arr[i - 1];
            i++;
        }
        System.out.println("the updated array is : ");
        int j = 0;
        while (j < n) {
            System.out.println(arr[j] + " ");
            j++;
        }
        sc.close();
    }
}
