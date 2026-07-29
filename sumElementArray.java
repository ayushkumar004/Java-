import java.util.*;
public class Main
{   
    static int largest(int[] arr){
        int sum=0;
        for(int x:arr){
            sum=sum+x;
        }
        return sum;
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int SUM=largest(arr);
		System.out.println(SUM);
	}
}//find sum of all element in an array
