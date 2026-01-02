package Strings;

import java.util.Scanner;
import java.util.Stack;

public class validparenthesis {
    static boolean paranthesis(String str1) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(ch=='[' || ch=='{' ||ch=='('){
                st.push(ch);
            }
            else{
                if (st.isEmpty())
                    return false;
                
                char top=st.pop();
                    if( (top=='{' && ch!='}') || (top=='[' && ch!=']')  ||(top=='(' && ch!=')')){
                        return false;
                    }
                }
            }
       return st.isEmpty();
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
       
        boolean res=paranthesis(str1);
        System.out.println(res);

        sc.close();
    }
}
