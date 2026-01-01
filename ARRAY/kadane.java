import java.util.Scanner;
public class kadane {
    static int maxSubArray(int[] arr,int n) {
        int curr = arr[0], max = arr[0];
    
        for (int i = 1; i < n; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            max = Math.max(max, curr);
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int res=maxSubArray(arr, size);
        System.out.println(res);
        sc.close();
    }
}
