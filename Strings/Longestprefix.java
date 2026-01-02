package Strings;

import java.util.Scanner;

public class Longestprefix {
    static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "-1";
    
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
    
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch)
                    return i == 0 ? "-1" : strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        System.out.println(longestCommonPrefix(strs));
        sc.close();
    }
    
}
