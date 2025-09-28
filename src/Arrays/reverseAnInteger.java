package Arrays;
import java.util.Scanner;

public class reverseAnInteger {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(reversedNum(num));
    sc.close();
    }
    static int reversedNum(int n){
        int reversedNo = 0;
        while(n>0){
            int digit = n % 10;
            reversedNo = reversedNo * 10 + digit;
            n = n / 10;
        }
        return reversedNo;
    }

}
