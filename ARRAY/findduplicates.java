import java.util.Scanner;

public class findduplicates {
    static void duplicates(int[] arr, int n){
        java.util.LinkedHashSet<Integer> set = new java.util.LinkedHashSet<>();
        java.util.LinkedHashSet<Integer> dup = new java.util.LinkedHashSet<>();

        for (int x : arr) {
            if (set.contains(x)) {
                dup.add(x);
            } else {
                set.add(x);
            }
        }
        if(dup.isEmpty())
            System.out.println("No duplicates");
        else
            for(int x : dup)
                System.out.print(x + " ");
        
    }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        duplicates(arr, size);
        sc.close();
    }
}
