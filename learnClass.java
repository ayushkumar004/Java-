import java.util.*;
public class Student{
    int rollNum;
    String name;
    int[] marks;
    public Student(int rollNum,String name,int[] marks){
        this.rollNum=rollNum;
        this.name=name;
        this.marks=marks;
    }
    double calculateAverage(){
        double sum=0;
        for(int x:marks ){
            sum=sum+x;
        }
        return sum/5.0;
    }
    char calculateGrade(){
        double average = calculateAverage();
        if(average>=90){
            return 'A';
        }
        else if(average>=75){
            return 'B';
        }
        else if(average>=60){
            return 'C';
        }
        else{
            return 'D';
        }
    }
    void displayDetails(){
        System.out.println("rollNum: "+rollNum);
        System.out.println("Name: "+name);
        System.out.println("Average: "+ calculateAverage());
        System.out.println("Grade "+ calculateGrade());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rollNum=sc.nextInt();
        sc.nextLine();
        String name=sc.next();
        int[] marks= new int[5];
        for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();
        }
        Student s =new Student(rollNum,name,marks);
        s.displayDetails();
    }
}//here we are learning about new class creation and the concept of encapsulation in java 
