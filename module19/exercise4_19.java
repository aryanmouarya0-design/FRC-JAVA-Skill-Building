package module19;

import java.util.Scanner;

public class exercise4_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements : ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println("the concatenation of first and last element is : " + arr[0].concat(arr[n - 1]));
        sc.close();
    }
}
