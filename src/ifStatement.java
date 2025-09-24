import java.util.Scanner;
public class ifStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter Your Age : ");
        age = sc.nextInt();

        if(age > 18){
            System.out.println("You are and Adult");
        }
        else if(age < 0){
            System.out.println("You haven't been Born Yet");
        }
        else{
            System.out.println("You are UnderAge");
        }

        sc.close();
    }
}
