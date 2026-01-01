import java.util.Scanner;

public class EquilibriumIndex {
      static int Equilibriumindex(int[] arr, int n){
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        int leftsum=0;
        for(int i=0;i<n;i++){
            int rightsum = sum-leftsum-arr[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
    }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int result = Equilibriumindex(arr, size);
        System.out.println(result);
        sc.close();
    }
}
