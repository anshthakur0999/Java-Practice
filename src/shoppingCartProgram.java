import java.util.Scanner;

public class shoppingCartProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '₹';
        double total;

        System.out.print("What item would you like to Buy ? ");
        item = sc.nextLine();

        System.out.print("What is the Price for each ? ");
        price = sc.nextDouble();

        System.out.print("How many Would you like ? ");
        quantity = sc.nextInt();

        total = price * quantity;
        System.out.print("\nYou have bought "+item+" And your total Would be "+total+currency);


        sc.close();
    }
}
