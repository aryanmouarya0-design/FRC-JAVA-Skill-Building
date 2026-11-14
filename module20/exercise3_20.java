package module20;

import java.util.Scanner;

public class exercise3_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] arr = new int[n];
        System.out.print("enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("The number of even elements is: " + even);
        System.out.println("The number of odd elements is: " + odd);
        sc.close();
    }
}
