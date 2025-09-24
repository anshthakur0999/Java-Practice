public class ternaryOperator {
    public static void main(String[] args){
        int score = 60;
        String passOrFail = (score >= 50) ? "PASS" : "FAIL";
        System.out.println(passOrFail);

        int number = 3;
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);
    }
}
