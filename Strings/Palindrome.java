package Strings;

import java.util.Scanner;

public class Palindrome {
    static boolean StringPalindrome(String str1) {
        if(str1.length()==0) return false;
        int i=0,j=str1.length()-1;
        while(i<j){
            if(str1.charAt(i)!=str1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
       return true;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
       
        boolean res=StringPalindrome(str1);
        System.out.println(res);

        sc.close();
    }
}
