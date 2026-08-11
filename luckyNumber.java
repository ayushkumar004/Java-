/*Problem Statement:

Jack has been interested in numerology and has learned how to calculate a lucky number for a given word using the rules below:

Each alphabet in the word has an ASCII value (where **'A' = 65, 'B' = 66, ..., 'Z' = 90, 'a' = 97, etc.).
Each letter in the word is assigned a 1-based index (i.e., the first letter has index 1, the second letter has index 2, and so on).
The lucky number is calculated as follows:
Multiply each character's ASCII value by its 1-based index.
Include this product in the sum only if either the index or the ASCII value (or both) are odd.*/


import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();
		int sum=0;
		for(int i=0;i<str.length();i++){
		    int index=i+1;
		    int ascii=(int)(str.charAt(i));
		    int product=index*ascii;
		    if(index%2!=0||ascii%2!=0){
		        sum=sum+product;
		    }
		}
		System.out.println(sum);
	}
}
