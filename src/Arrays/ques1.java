package Arrays;
import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        //input
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                int sum = arr[i]+arr[j];
                if(sum == K){
                    count++;
                }
            }
        }
        System.out.println(count);

        sc.close();
    }
}
