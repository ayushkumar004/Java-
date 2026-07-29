import java.util.*;
public class Main
{   
    static Boolean palindrome(String s){
        String reverse= new StringBuilder(s).reverse().toString();
        if(s.equals(reverse)){
            return true;
        }
        else{
            return false;
        }
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
	    Boolean ans=palindrome(s);
	    System.out.println(ans);
		
	}
}//find weather a string is palindrome or not
