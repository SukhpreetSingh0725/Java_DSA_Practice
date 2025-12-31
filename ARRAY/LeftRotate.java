import java.util.Scanner;

public class LeftRotate {
    static void reverseArray(int[] arr, int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void leftRotate(int[] arr, int n, int k){
        k=k%n;
        reverseArray(arr, 0,k-1);
        reverseArray(arr, k,n-1);
        reverseArray(arr, 0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
       
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        leftRotate(arr, size, k);
        sc.close();
    }

}
