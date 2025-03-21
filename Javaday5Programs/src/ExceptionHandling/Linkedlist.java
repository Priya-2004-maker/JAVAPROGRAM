package ExceptionHandling;
import java.util.*;
public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<Integer> arrlist=new LinkedList<>();
		arrlist.addFirst(100); /// adds an  element at the beggining of the list
		arrlist.addLast(200); // adds an element at the end of the list
		arrlist.add(300);// adds an element at the end of the list
        arrlist.add(500);
		System.out.println(arrlist.get(1)); //get
		System.out.println(arrlist.set(0, 2000)); //set
		System.out.println(arrlist.get(0));
		System.out.println(arrlist.remove(3));//remove the element at the specified index
		System.out.println(arrlist.get(0));
		System.out.println(arrlist.size()); //returns the size of the list
		System.out.println(arrlist.isEmpty()); // to checks if the list is empty
		
	}

}
