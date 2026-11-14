package module21;

public class exercise3_21 {
    public static void squareArray(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        int[][] squaredArr = new int[r][c];
        System.out.println("The squared array is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                squaredArr[i][j] = arr[i][j] * arr[i][j];
                System.out.print(squaredArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void cubeArray(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        int[][] cubedArr = new int[r][c];
        System.out.println("The cubed array is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                cubedArr[i][j] = arr[i][j] * arr[i][j] * arr[i][j];
                System.out.print(cubedArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        squareArray(arr);
        cubeArray(arr);
    }
}
