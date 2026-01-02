package Strings;

import java.util.Scanner;

public class uppercase {
   static String upper(String str) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
           
            if(ch>='A' && ch<='Z'){
                sb.append(ch);
            }
            else if(ch>='a' && ch<='z'){
                ch=(char)(ch-32);
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
       
        String res=upper(str1);
        System.out.println(res);

        sc.close();
    } 
}
