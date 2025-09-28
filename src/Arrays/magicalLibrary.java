package Arrays;
import java.util.Scanner;

public class magicalLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Read the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = magicalRows(arr);
        System.out.println(result);
    }

    // Count rows where the sum of odd elements is even
    static int magicalRows(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            int oddCount = 0;
            for (int j = 0; j < cols; j++) {
                if ((a[i][j] & 1) == 1) { // odd?
                    oddCount++;
                }
            }
            if ((oddCount & 1) == 0) {   // even number of odds -> magical
                count++;
            }
        }
        return count;
    }
}
