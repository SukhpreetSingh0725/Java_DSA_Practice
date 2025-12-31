import java.util.Scanner;
public class duplicate {
    static void RemoveDuplicates(int[] arr, int n){
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        for(int i=0;i<j+1;i++){
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
       RemoveDuplicates(arr, size);
       sc.close();
    }
}
