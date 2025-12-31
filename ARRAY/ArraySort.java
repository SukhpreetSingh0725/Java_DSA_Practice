import java.util.Scanner;
public class ArraySort{
    static void Arraysort(int[] arr, int n){
        boolean check=true;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        if(check==false){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
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
       Arraysort(arr, size);
       sc.close();
    }
}
