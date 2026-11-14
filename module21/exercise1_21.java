package module21;

import java.util.Scanner;

public class exercise1_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements in row: ");
        int r = sc.nextInt();
        System.out.print("enter the number of elements in column: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("enter the element at position [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("the transpose of the matrix is : ");
        int[][] trans = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                trans[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
