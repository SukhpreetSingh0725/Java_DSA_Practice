import java.util.Scanner;

public class mostwater {
    static int maxArea(int[] arr,int n) {
        int l = 0, r = n - 1;
        int max = 0;
    
        while (l < r) {
            int area = Math.min(arr[l], arr[r]) * (r - l);
            max = Math.max(max, area);
    
            if (arr[l] < arr[r]) l++;
            else r--;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int res=maxArea(arr, size);
        System.out.println(res);
        sc.close();
    }
}
