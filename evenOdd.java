import java.util.*;
public class Main
{   
    static void even(int n){
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("not even");
        }
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m=sc.nextInt();
		even(m);
	}
}//find weather a number is even or odd
