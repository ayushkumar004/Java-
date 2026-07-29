import java.util.*;
public class Main
{   
    static int largest(int[] arr){
        int max=arr[0];
        for(int x:arr){
            if(x>max){
                max=x;
            }
        }
        return max;
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int MAX=largest(arr);
		System.out.println(MAX);
	}
}//  find max num in array
