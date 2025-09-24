public class nestedIf {
    public static void main(String[] args){

        boolean isStudent = true;
        boolean isSenior;
        double price = 9.99;

        if(isStudent){
            System.out.println("You get a student Discount of 10%");
            price *= 0.9;
        }
        else{
            price *= 1;
        }

        System.out.printf("Price After Discount:%.2f\n",price);

    }
}
