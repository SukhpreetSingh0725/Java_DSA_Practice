import java.util.Scanner;

public class productarray {
    static void productExceptSelf(int[] arr,int n) {
        int[] res = new int[n];

        res[0] = 1;
        for (int i = 1; i < n; i++)
            res[i] = res[i - 1] * arr[i - 1];
    
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        productExceptSelf(arr, size);
        sc.close();
    }
}
