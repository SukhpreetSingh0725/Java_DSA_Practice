import java.util.Scanner;
public class MaxMin {
    static void findMaxMin(int[] arr, int n){
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max+" "+min);

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
        findMaxMin(arr, size);
        sc.close();
    }

}
