package Strings;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FirstNonRepeatChar {
    static char firstNonRepeatChar(String str1) {
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(char c:str1.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char c:str1.toCharArray()){
            if (map.get(c) ==1 ) return c;
        }
        return '#';
        
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
       
        char res=firstNonRepeatChar(str1);
        System.out.println(res);

        sc.close();
    }
}
