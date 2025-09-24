import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal, interest, time, compoundedAmount;
        int compoundedAnnually;

        System.out.print("Enter principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        interest = sc.nextDouble() / 100;

        System.out.print("Enter time (in years): ");
        time = sc.nextDouble();

        System.out.print("Enter how many times it's compounded annually: ");
        compoundedAnnually = sc.nextInt();

        // Formula: A = P * (1 + r/n)^(n*t)
        compoundedAmount = principal * Math.pow(1 + (interest / compoundedAnnually),
                compoundedAnnually * time);

        System.out.printf("Compounded amount: %.2f\n", compoundedAmount);

        sc.close();
    }
}
