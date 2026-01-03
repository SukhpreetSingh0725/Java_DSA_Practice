package Strings;

import java.util.Scanner;
import java.util.Stack;

public class reverseposition {

    static String revwords(String str) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        str=str.trim();
        int i = str.length() - 1;

        while (i >= 0) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                while (!st.isEmpty()) {
                    sb.append(st.pop());
                }
                sb.append(' ');
                i--;
            }
            else {
                st.push(ch);
                i--;
            }
        }

        // flush last word
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(revwords(str));
        sc.close();
    }
}
