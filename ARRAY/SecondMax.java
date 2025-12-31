import java.util.Scanner;
public class SecondMax {
    static int secondLargest(int[] arr, int n){
        int max=Integer.MIN_VALUE,smax=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        return smax;

    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int result=secondLargest(arr, size);
        System.out.println(result);
        sc.close();
    }

}
