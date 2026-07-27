//print number from 1 to  100
import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<100;i++){
            System.out.println(i+1);
        }
        
    }
}
//print the multiplication of a table
import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+ i + " = "+(num*i));
        }
        sc.close();
    }
}
