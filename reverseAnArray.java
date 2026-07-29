import java.util.*;
public class Main
{   
    static void Reverse(int[] arr,int n){
        int left=0;
        int right=n-1;
        while(left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            
            left++;
            right--;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		Reverse(arr,n);
	}
}      //reverse array 
