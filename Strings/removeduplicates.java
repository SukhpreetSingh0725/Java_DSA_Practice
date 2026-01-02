package Strings;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class removeduplicates {
    static String RemoveDuplicates(String str1) {
       LinkedHashSet<Character> set=new LinkedHashSet<>();
       StringBuilder sb=new StringBuilder();
       for(char x:str1.toCharArray()){
        if(!set.contains(x)){
            sb.append(x);
            set.add(x);
        }
       }
       return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
       
        String res=RemoveDuplicates(str1);
        System.out.println(res);

        sc.close();
    }
}
