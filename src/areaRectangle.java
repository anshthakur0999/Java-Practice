import java.util.Scanner;

public class areaRectangle {
    public static void main(String[] args){
        //Area of Rectangle = l*b
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle:");
        int l = sc.nextInt();

        System.out.println("Enter Breadth of Rectangle:");
        int b = sc.nextInt();

        System.out.println("Area of Rectangle is:"+l*b);

        sc.close();
    }
}
