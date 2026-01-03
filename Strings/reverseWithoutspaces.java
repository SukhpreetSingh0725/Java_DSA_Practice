package Strings;

import java.util.Scanner;

public class reverseWithoutspaces {
   
    public static  String reverseOnlyLetters(String s) {
        int i=0,j=s.length()-1;
        StringBuilder sb=new StringBuilder(s);

        while(i<j){
            char a=sb.charAt(i);
            char b=sb.charAt(j);
            if(!Character.isAlphabetic(a)){
                i++;
            }
            else if(!Character.isAlphabetic(b)){
                j--;
            }
            else{
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(reverseOnlyLetters(str));
        sc.close();
    }
}


