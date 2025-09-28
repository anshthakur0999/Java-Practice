package Arrays;
import java.util.Scanner;
public class penSwitching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<N-1;i++){
            if(arr[i] % 2 != 0 && arr[i+1] % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
