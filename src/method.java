public class method {
    public static void main(String[] args){

        String name = "Ansh";
        int age = 21;

        happyBirthday(name,age);
        happyBirthday(name,age);
        happyBirthday(name,age);
        happyBirthday(name,age);
    }

    static void happyBirthday(String name,int age){
        System.out.printf("Happy Birthday to you %s \n",name);
        System.out.printf("Happy Birthday dear you %s !! \n",name);
        System.out.printf("You are %d years old \n",age);
        System.out.printf("Happy Birthday to you %s \n",name);
        System.out.println("\n");
    }
}
