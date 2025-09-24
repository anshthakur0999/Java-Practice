import java.util.Scanner;

public class calculatorProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double num1,num2;
        char operator;

        System.out.print("Enter the First Number:");
        num1 = sc.nextDouble();

        System.out.print("Enter the Second Number:");
        num2 = sc.nextDouble();

        System.out.print("Enter What Operation you Would like to Perform +,-,*,/,^ :");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+' -> System.out.printf("The SUM of your two number is : %.2f" , num1+num2);
            case '-' -> System.out.printf("The SUB of your two number is : %.2f" , (num1-num2));
            case '*' -> System.out.printf("The MUL of your two number is : %.2f" , num1*num2);
            case '^' -> System.out.printf("%.2f", Math.pow(num1,num2));
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Error: Division by zero!");
                } else {
                    System.out.printf("The DIV of your two numbers is : %.2f", num1 / num2);
                }
            }
            default -> System.out.println("Invalid operator! Please use +, -, *, or /.");
        };
        sc.close();
    }
}
