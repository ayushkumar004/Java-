import java.util.*;
public class Main
{   
    static int square(int n){
        return n*n;
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m=sc.nextInt();
		int square=square(m);
		System.out.println(square);
	}
}//find square of a number
