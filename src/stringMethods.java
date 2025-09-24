public class stringMethods {
    public static void main(String[] args){
        String name = "Ansh Thakur";
        int length = name.length();
        System.out.println("Length of name is:"+length);

        char letter = name.charAt(2);
        System.out.println("Character at second index is:"+letter);

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        int index = name.indexOf('T');
        System.out.println(index);
        int lastIndex = name.lastIndexOf("a");
        System.out.println(lastIndex);
        System.out.println(name.trim());
        System.out.println(name.replace("Thakur","thakur"));
    }
}
