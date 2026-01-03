package Strings;

import java.util.Scanner;

public class StringCompression {
    static String CompressString(String str) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<str.length()){
            int count=1;
            char ch=str.charAt(i);
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            if(count>1 ){
                    sb.append(ch).append(count);
                }
                else{
                    sb.append(ch);
                }
                i++;
            }
        return sb.toString();
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
       
        String res=CompressString(str1);
        System.out.println(res);

        sc.close();
    }
}
