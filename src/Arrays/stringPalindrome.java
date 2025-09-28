package Arrays;
import java.util.Scanner;
public class stringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        boolean isPalindrome = true;
        int left = 0;
        int right = str.length() - 1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome);
        sc.close();
    }
}
