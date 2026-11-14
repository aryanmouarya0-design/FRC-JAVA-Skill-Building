package module21;

public class exercise4_21 {
    public static void absArray(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        int[][] absArr = new int[r][c];
        System.out.println("The absolute value array is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                absArr[i][j] = Math.abs(arr[i][j]);
                System.out.print(absArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {-1, -2, -3},
            {4, -5, 6},
            {-7, 8, -9}
        };
        absArray(arr);
    }
}
