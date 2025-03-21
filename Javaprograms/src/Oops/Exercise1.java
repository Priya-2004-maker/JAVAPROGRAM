package Oops;
import java.util.*;
class Foods{
	String recp;
	int quantity;
	int price;
	void dish() {//method name
		System.out.println("Enter your Food item: "+recp);
		System.out.println("Enter your Food quantity: "+quantity);
		System.out.println("price : "+price);
		
	}
	
}
public class Exercise1 {
	public static void main(String[] args) {
		Foods s1=new Foods();
		s1.recp="Biriyani";
		s1.quantity=2;
		s1.price=1000;
		s1.dish();

}
}
