import java.util.Scanner;

public class MissingNo {
    static int missingNumber(int[] arr, int n){
        int sum=0;
        n=n+1;
        int ans=(n*(n+1))/2;
        for(int i=0;i<n-1;i++){
            sum+=arr[i];
        }
        return ans-sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int result = missingNumber(arr, size);
        System.out.println(result);
        sc.close();
    }

}
