import java.util.Scanner;
public class SerachRotated {
    static int search(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) return mid;

            if (arr[low] <= arr[mid]) {
                if (x >= arr[low] && x < arr[mid]) high = mid - 1;
                else low = mid + 1;
            } else {
                if (x > arr[mid] && x <= arr[high]) low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(search(arr, n, x));
        sc.close();
    }
}


