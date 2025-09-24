public class printfMethod {
    public static void main(String[] args){

        String name = "Spongebob";
        char FirstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s Your age is %d\n",name,age);
        System.out.printf("Your name starts with a %c\n",FirstLetter);
        System.out.printf("Employement Status:%b\n",isEmployed);


        double price1,price2,price3;
        price1 = 9.99;
        price2 = 100.15;
        price3 = -54.01;

        System.out.printf("Price 1 : %.2f\n",price1);
        System.out.printf("Price 2 : %.1f\n",price2);
        System.out.printf("Price 3 : %.1f\n",price3);
    }
}
