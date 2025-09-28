package Arrays;
import java.util.Scanner;
public class numberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String reversed = new StringBuilder(str).reverse().toString();

        if(str.equals(reversed)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
