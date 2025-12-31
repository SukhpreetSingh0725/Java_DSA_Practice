import java.util.Scanner;
public class ZeroAtEnd {
    static void zeroAtEnd(int[] arr, int n){
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[idx++] = arr[i];
            }
        }
        while (idx < arr.length) {
            arr[idx++] = 0;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
           
        }
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
       zeroAtEnd(arr, size);
       sc.close();
    }
}
