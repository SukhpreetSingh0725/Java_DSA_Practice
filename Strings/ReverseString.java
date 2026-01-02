package Strings;
import java.util.Scanner;

public class ReverseString {
    static String revString(String str1) {
        StringBuilder sb=new StringBuilder();
        for(int i=str1.length()-1;i>=0;i--){
            sb.append(str1.charAt(i));
        }
        return sb.toString();
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
       
        String res=revString(str1);
        System.out.println(res);

        sc.close();
    }
}
