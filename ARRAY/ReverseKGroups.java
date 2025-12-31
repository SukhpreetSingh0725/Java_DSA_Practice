import java.util.Scanner;
public class ReverseKGroups {
    static void reverseInGroups(int[] arr, int n, int k){
            for (int i = 0; i < n; i += k) {
                int left = i;
                int right = Math.min(i + k - 1, n - 1);
    
                while (left < right) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }
            for(int i = 0; i < n; i++){
               System.out.print(arr[i]+" ");
            }
            
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        reverseInGroups(arr, size,k);
        sc.close();
    }

}
