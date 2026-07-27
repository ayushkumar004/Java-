import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;
        for(int i=num;i>=1;i--){
            fact = fact*i;
        }
        System.out.println(fact);
        sc.close();
    }
}

//example  factorial of 5 is 5*4*3*2*1
