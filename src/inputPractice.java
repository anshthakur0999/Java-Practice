import java.util.Scanner;

public class inputPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter Your Age:");
        int age = sc.nextInt();

        System.out.println("What is Your GPA:");
        double gpa = sc.nextDouble();

        System.out.println("Are you a Student?? (true/false)");
        boolean isStudent = sc.nextBoolean();

        System.out.println("Hello "+name);
        System.out.println("Your are "+age+" Years old");
        System.out.println("Your GPA is:"+gpa);
        System.out.println("Student:"+isStudent);

        if (isStudent){
            System.out.println("You are a student");
        }
        else {
            System.out.println("You are not a student");
        }
        sc.close();
    }
}
