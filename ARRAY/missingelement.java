import java.util.Scanner;

public class missingelement {
    static int findMissingBag(int[] departure, int[] arrival) {
        int xor = 0;

        for (int x : departure)
            xor ^= x;

        for (int x : arrival)
            xor ^= x;

        return xor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); // number of bags checked in
        int n = sc.nextInt(); // number of bags arrived
        int[] departure = new int[m];
        int[] arrival = new int[n];
        for (int i = 0; i < m; i++)
            departure[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            arrival[i] = sc.nextInt();
        System.out.println(findMissingBag(departure, arrival));
        sc.close();
    }
}


