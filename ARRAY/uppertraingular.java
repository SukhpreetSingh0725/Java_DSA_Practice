import java.util.Scanner;

class upperTraingular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        boolean isUpper = true;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (mat[i][j] != 0) {
                    isUpper = false;
                    break;
                }
            }
        }

        if (isUpper)
            System.out.println("upper triangular matrix");
        else
            System.out.println("not an upper triangular matrix");

        sc.close();
    }
}

