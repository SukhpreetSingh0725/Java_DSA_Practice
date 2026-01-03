package Strings;

import java.util.Scanner;

public class Atoi {

    static int myAtoi(String s) {
        int i = 0, sign = 1, num = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
    
            if (ch == ' ') {
                i++;
            }
            else if (ch == '+' || ch == '-') {
                sign = (ch == '-') ? -1 : 1;
                i++;
            }
            else if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
                i++;
            }
            else {
                break;
            }
        }
        return sign * num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(myAtoi(s));
        sc.close();
    }
}

