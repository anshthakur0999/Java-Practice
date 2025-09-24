import java.util.Scanner;

public class subString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String email;
        String username;
        String domain;
        System.out.println("Enter your Email:");
        email = sc.nextLine();

        if(email.contains("@")){
            username = email.substring(0,email.indexOf('@'));
            domain = email.substring(email.indexOf('@')+1);

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Email must contain @");
        }


        sc.close();
    }
}
