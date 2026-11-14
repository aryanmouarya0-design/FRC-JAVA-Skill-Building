package module19;

import java.util.Scanner;

public class exercise5_19 {
    public static int maxArray(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the index of first element :");
        int a = sc.nextInt();
        System.out.println("enter the index of second element :");
        int b = sc.nextInt();
        int max = maxArray(arr[a], arr[b]);
        System.out.println("The maximum of the two elements is: " + max);
        sc.close();
    }
}
