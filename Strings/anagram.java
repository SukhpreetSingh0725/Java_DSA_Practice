package Strings;

import java.util.HashMap;
import java.util.Scanner;


public class anagram {
     static boolean checkAnagram(String str1,String str2) {
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();
        if(str1.length()!=str2.length()) return false;
        HashMap<Character,Integer> map=new HashMap<>();

        for(char c:str1.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char c:str2.toCharArray()){
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if (map.get(c) < 0) return false;
        }
        
       return true;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
       
        boolean res=checkAnagram(str1,str2);
        System.out.println(res);

        sc.close();
    }
}
