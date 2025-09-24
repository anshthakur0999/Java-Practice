import java.sql.SQLOutput;
import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a,b,c;
        System.out.print("Enter Value of a:");
        a = sc.nextDouble();

        System.out.print("Enter Value of b:");
        b = sc.nextDouble();

        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("Value of Hypotenuse is:"+c);

        sc.close();
    }
}
