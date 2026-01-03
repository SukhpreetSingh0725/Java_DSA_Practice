package Strings;

import java.util.Scanner;
import java.util.Stack;

public class StringDecode {

    static String decodeString(String str) {
        Stack<Character> letters = new Stack<>();
        Stack<Integer> digits = new Stack<>();

        int i = str.length() - 1;
        while (i >= 0) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                int num = 0;
                int place = 1;
                while (i >= 0 && Character.isDigit(str.charAt(i))) {
                    num += (str.charAt(i) - '0') * place;
                    place *= 10;
                    i--;
                }
                digits.push(num);
            }
            else if (Character.isAlphabetic(c)) {
                int count = digits.isEmpty() ? 1 : digits.pop();

                while (count-- > 0) {
                    letters.push(c);
                }
                i--;
            }
            else {
                i--;
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!letters.isEmpty()) {
            sb.append(letters.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(decodeString(str));
        sc.close();
    }
}
