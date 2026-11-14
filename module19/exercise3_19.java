package module19;

import java.util.Scanner;

public class exercise3_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the square root of 2nd elements is : " + Math.sqrt(arr[1]));
        sc.close();
    }
}
