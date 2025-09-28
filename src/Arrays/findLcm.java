package Arrays;

import java.util.Scanner;

public class findLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(lcm(num1,num2));
        sc.close();
    }
    static int lcm(int a,int b){
        int res = Math.max(a,b);
        while(true){
            if(res % a ==0 && res % b ==0){
                break;
            }
            res++;
        }
        return res;
    }

}
