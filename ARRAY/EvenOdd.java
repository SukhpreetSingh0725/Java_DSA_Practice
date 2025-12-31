import java.util.Scanner;

public class EvenOdd {
    static void countEvenOdd(int[] arr, int n){
        int even=0, odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }
            if(arr[i]%2!=0){
                odd++;
            }
        }
        System.out.println(even+" "+odd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        countEvenOdd(arr, size);
        sc.close();
    }

}
