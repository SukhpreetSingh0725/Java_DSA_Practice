import java.util.Scanner;
public class LinearSearch {
    static int linearSearch(int[] arr, int n, int x){
        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                ans=i;
                return ans;
            }
        }
        return -1;
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();
        System.out.print("Enter Element to find: ");
        int x = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            System.out.print("Enter "+i+"th element: ");
            arr[i]=sc.nextInt();
        }
        int result=linearSearch(arr, size,x);
        System.out.println(result);
        sc.close();
    }
}
