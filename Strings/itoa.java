package Strings;

import java.util.Scanner;

public class itoa {
    static String intToString(int num) {
        if (num == 0) return "0";
    
        boolean negative = false;
        if (num < 0) {
            negative = true;
            num = -num;
        }
    
        StringBuilder sb = new StringBuilder();
    
        while (num > 0) {
            int digit = num % 10;
            sb.append((char)(digit + '0'));
            num = num / 10;
        }
    
        if (negative)
            sb.append('-');
    
        return sb.reverse().toString();
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(intToString(num));
        sc.close();
    }
}
