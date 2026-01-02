package Strings;

import java.util.Scanner;

public class Lowercase {
    static String lower(String str) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                sb.append(ch);
            }
            else if(ch>='A' && ch<='Z'){
                ch=(char)(ch+32);
                sb.append(ch);
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
       
        String res=lower(str1);
        System.out.println(res);

        sc.close();
    } 
}
