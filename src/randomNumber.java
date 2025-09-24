import java.util.Random;

public class randomNumber {
    public static void main(String[] args){
        Random random = new Random();
        int number = random.nextInt(1,10);
        System.out.println(number);

        double d = random.nextDouble();
        System.out.println(d);

        long l = random.nextLong();
        System.out.println(l);
    }
}
