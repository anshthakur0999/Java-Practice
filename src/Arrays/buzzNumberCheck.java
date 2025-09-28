package Arrays;
import java.util.Scanner;
public class buzzNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(buzzCheck(num));
        sc.close();
    }
    static boolean buzzCheck(int n){
        if(n%10==7 || n%7 ==0) {
            return true;
        }
        return false;
    }
}
