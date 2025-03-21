package ExceptionHandling;
import java.util.*;
public class Exercise6 {
	public static void main(String[] args) {
		ArrayList<Integer> arrlist=new ArrayList<>();
		arrlist.add(100);
		arrlist.add(200);
		//arrlist.add("priya");
		//System.out.println(arrlist);
		// Using forloop
		//for(int i=1;i<=10;i++) {
			//arrlist.add(i);
			//System.out.println(arrlist);
			//using for-each loop
			arrlist.add(300);
			arrlist.add(500);
			System.out.println(arrlist.get(0)); //get
			System.out.println(arrlist.set(0, 1000)); //set
			System.out.println(arrlist.get(0));
			System.out.println(arrlist.remove(0));
			System.out.println(arrlist.get(0));
			System.out.println("..........................................");
			for(int i:arrlist) {
				System.out.println(i);
		}
	}

}
