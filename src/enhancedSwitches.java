import java.util.Scanner;

public class enhancedSwitches {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String day;
        System.out.print("Enter Day : ");
        day = sc.nextLine();

        String result = switch (day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> "It's a weekday";
            case "Saturday","Sunday" -> "It's a weekend";
            default -> "Not a valid day";
        };
        System.out.print(result);
        sc.close();
    }
}
