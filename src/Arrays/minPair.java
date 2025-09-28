package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class minPair {
    public static void main(String[] args) {

        int[] arr = {1,4,3,2};
        int[] brr = {1,4,3,4};
        System.out.println(pair(arr,brr));

    }
    static int pair(int[] A,int[] B){
        int sum = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i<A.length;i++){
            sum+=A[i]*B[A.length-i-1];
        }
        return sum;
    }
}
