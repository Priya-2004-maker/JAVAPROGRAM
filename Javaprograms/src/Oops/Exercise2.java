package Oops;
import java.util.*;

public class Exercise2 {
	public static int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		int sum=add(100,400);
		System.out.println("Sum is:"+ sum);
		//System.out.println(add(200,200);
		// to get input from the user using scanner class
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the values:");
		int inp1=s1.nextInt();
		int inp2=s1.nextInt();
		System.out.println(add(inp1,inp2));
	}

}
         