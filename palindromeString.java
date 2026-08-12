import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] ch=s.toCharArray();
		int start=0;
		int end=ch.length-1;
		while(start<end){
		    char temp=ch[start];
		    ch[start]=ch[end];
		    ch[end]=temp;
		    start++;
		    end--;
		}
		String reversed=new String(ch);
		if(s.equals(reversed)){
		    System.out.println("Palindrome");
		}
		else {
            System.out.println("Not a Palindrome");
        }
	}
}
