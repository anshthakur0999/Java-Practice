package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class readingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // I/O format you're using: hours, size, then array
        int hours = sc.nextInt();
        int arrSize = sc.nextInt();

        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int ans = maxReading(arr, hours);
        System.out.println(ans);
    }

    static int maxReading(int[] a, int hours) {
        Arrays.sort(a);      // read shortest books first
        int count = 0;
        int sum = 0;

        for (int t : a) {
            if (sum + t <= hours) {
                sum += t;
                count++;     // one more book fits
            } else {
                break;       // next ones are >= t, so they won't fit either
            }
        }
        return count;
    }
}
