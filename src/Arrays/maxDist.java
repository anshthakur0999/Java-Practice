package Arrays;
import java.util.Scanner;
public class maxDist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(maximumDist(str));
        sc.close();
    }
    static int maximumDist(String s){
        int length = s.length();
        int maxdist = 0;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(s.charAt(i)!=s.charAt(j)){
                    int dist = j-i;
                    maxdist = Math.max(maxdist,dist);
                }
            }
        }
        return maxdist;
    }



}
