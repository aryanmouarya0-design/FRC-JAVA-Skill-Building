package module21;

public class exercise5_21 {
    public static void minmaxArray(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        int min = arr[0][0];
        int max = arr[0][0];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: " + max);
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        minmaxArray(arr);
    }
}
