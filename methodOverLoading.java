import java.util.*;
public class Example
{
    public void Display(){
        System.out.println("no parameter passes");
    }
    public void Display(String name){
        System.out.println("Name is: "+name);
    }
	public static void main(String[] args) {
		Example e=new Example();
		e.Display();
		e.Display("ayush");
	}
}
//simple code to explain method overloading in java
