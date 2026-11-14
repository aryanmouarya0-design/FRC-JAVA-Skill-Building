package module21;

import java.util.Scanner;

public class exercise2_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements in row : ");
        int r = sc.nextInt();
        System.out.print("enter the number of elements in column : ");
        int c = sc.nextInt();

        int[][] arr1 = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("enter the element at position(matrix 1) [" + i + "][" + j + "]: ");
                arr1[i][j] = sc.nextInt();
            }
        }

        int[][] arr2 = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("enter the element at position(matrix 2) [" + i + "][" + j + "]: ");
                arr2[i][j] = sc.nextInt();
            }
        }

        int[][] sum = new int[r][c];
        System.out.println("The sum of the two matrices is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
