package Strings;

import java.util.Scanner;
import java.util.Stack;

public class Reversewords {
    static String revwords(String str1){
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if (ch != ' ') {
                st.push(ch);
            } else {
                while (!st.isEmpty()) {
                    sb.append(st.pop());
                }
                sb.append(ch); 
            }
        }

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.toString();
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
       
        String res=revwords(str1);
        System.out.println(res);

        sc.close();
    }
}

