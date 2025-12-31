import java.util.Scanner;
public class reverse {
    static void reverseArray(int[] arr, int n){
        int i=0,j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(i=0;i<n;i++){
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
        reverseArray(arr, size);
        sc.close();
    }
}
