import java.util.Scanner;
import java.util.Random;

public class javaDiceRoller {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.print("Enter the No of dice to Roll: ");
        numOfDice = sc.nextInt();

        if(numOfDice>0){

            for(int i=1;i<=numOfDice;i++){
                int roll = random.nextInt(1,7);
                System.out.println("You rolled "+ roll);
                total = total + roll;
            }
            System.out.print("Total:"+total);
        }
        else{
            System.out.println("No of dice must be greater than 0");
        }

        sc.close();
    }
}
