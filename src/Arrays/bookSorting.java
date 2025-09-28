package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class bookSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(swaps(s));
        sc.close();
    }
    static int swaps(String s){
        char[] sorted = s.toCharArray();
        Arrays.sort(sorted);
        String sortedStr = new String(sorted);
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != sortedStr.charAt(i)){
                count++;
            }
        }
        return count;
    }

}
