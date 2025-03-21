package Oops;
class Library{
	int bookId;
	String Title;
	String Author;
	int price;
	Library(int bookId,String Title,String Author,int price){
		this.bookId=bookId;
		this.Title=Title;
		this.Author=Author;
		this.price=price;
	}
void display() {
	System.out.println(" Enter the BookId: "+bookId);
	System.out.println(" Enter the Title: "+Title);
	System.out.println(" Enter the Author: "+Author);
	System.out.println(" Enter the Price: "+price);
}
	
}
public class Exercise3 {
	public static void main(String[] args) {
		Library l1= new  Library(22,"c","John",120);
		Library l2= new Library(22,"c++","John",120);
		Library l3= new Library(22,"Java","John",120);
		l1.display();
		l2.display();
		l3.display();
		}
}
