package Arrays;
import java.util.Scanner;
public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(countTriplets(arr));
        sc.close();
    }
    static int countTriplets(int[] a){
        if(a.length<3){
            return 0;
        }
        int count = 0;
        for(int i=0;i+2<a.length;i++){
            if(a[i] + a[i+2] == a[i+1]){
                count++;
            }
        }
        return count;
    }

}
