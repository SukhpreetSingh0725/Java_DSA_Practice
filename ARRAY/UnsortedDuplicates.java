import java.util.Scanner;
public class UnsortedDuplicates {
    static void unsortedDuplicates(int[] arr, int n){
     java.util.LinkedHashSet<Integer> set = new java.util.LinkedHashSet<>();
        for (int x : arr)
            set.add(x);

        for (int x : set)
            System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            System.out.print("Enter "+i+"th element: ");
            arr[i]=sc.nextInt();
        }
       unsortedDuplicates(arr, size);
       sc.close();
    }
}
