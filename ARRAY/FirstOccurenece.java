import java.util.Scanner;
public class FirstOccurenece {
    static int firstOccurrence(int[] arr, int n, int x){
        int ans=-1;
        int start=0,end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid] == x) {
                ans = mid;     
                end = mid - 1; 
            }
            if(arr[mid]>x){
                end=mid-1;
            }
            if(arr[mid]<x){
                start=mid+1;
            }
        }
        return ans;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
       
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int result = firstOccurrence(arr, size, k);
        System.out.println(result);
        sc.close();
    }
    

}