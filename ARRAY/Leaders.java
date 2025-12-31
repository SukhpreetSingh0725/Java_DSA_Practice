import java.util.*;

public class Leaders {
    static void printLeaders(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int max = arr[n - 1];
        st.push(max);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                st.push(max);
            }
        }
        while (!st.isEmpty())
            System.out.print(st.pop() + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        printLeaders(arr, n);
        sc.close();
    }
}
