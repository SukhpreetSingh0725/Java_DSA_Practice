import java.util.Scanner;

public class CountOccurence {
        static int firstOccurrence(int[] arr, int x) {
            int low = 0, high = arr.length - 1;
            int ans = -1;
    
            while (low <= high) {
                int mid = low + (high - low) / 2;
    
                if (arr[mid] == x) {
                    ans = mid;
                    high = mid - 1;
                } else if (arr[mid] < x) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return ans;
        }
        static int lastOccurrence(int[] arr, int x) {
            int low = 0, high = arr.length - 1;
            int ans = -1;
    
            while (low <= high) {
                int mid = low + (high - low) / 2;
    
                if (arr[mid] == x) {
                    ans = mid;
                    low = mid + 1; 
                } else if (arr[mid] < x) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return ans;
        }
    
        static int countOccurrences(int[] arr, int x) {
            int first = firstOccurrence(arr, x);
            if (first == -1) return 0;
    
            int last = lastOccurrence(arr, x);
            return last - first + 1;
        }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        int result = countOccurrences(arr, k);
        System.out.println(result);
        sc.close();
    }

}
