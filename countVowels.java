import java.util.*;
public class Main
{   
    static int  count(String s){
        int n=s.length();
        s=s.toLowerCase();
        int count=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		
		int Count=count(s);
		System.out.println(Count);
	}
}//used to count vowel in a string
