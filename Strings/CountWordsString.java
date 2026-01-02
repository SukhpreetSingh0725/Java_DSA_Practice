package Strings;
import java.util.Scanner;

public class CountWordsString{
    static int CountWords(String str1) {
        if (str1.trim().length() == 0)
            return 0;
    
        String[] words = str1.trim().split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
       
        int res=CountWords(str1);
        System.out.println(res);

        sc.close();
    }
}
