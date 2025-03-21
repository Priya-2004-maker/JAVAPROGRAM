package Oops;
class Bike{
	int count;
	String bikename;
	Bike(int count,String bikename){
		this.count=count;
		this.bikename=bikename;
	}
	void display() {
		System.out.println("The bike count is : "+count);
		System.out.println("The bike name is : "+bikename);
	}
}

public class ParamerizedConstructor {
	public static void main(String[] args) {
		Bike b1=new Bike(2,"Royal Enfield");
		b1.display();
		
	}

}
