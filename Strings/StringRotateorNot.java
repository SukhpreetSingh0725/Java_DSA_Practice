package Strings;
import java.util.Scanner;

public class StringRotateorNot {
    static boolean StringRotate(String str1,String str2) {
        if (str1 == null || str2 == null) return false;
        if (str1.length() != str2.length()) return false;
        String temp = str2 + str2;
        return temp.contains(str1) ? true : false;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean res=StringRotate(str1,str2);
        System.out.println(res);

        sc.close();
    }
}
