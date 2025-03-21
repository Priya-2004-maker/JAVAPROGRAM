package Oops;
class car{
	String brand;
	car(){// class name and method name is same
		brand="unknown";
	}
	
	void display() {
		System.out.println("The brand name is: "+brand);
		

	}
}

public class Constructor {
	public static void main(String[] args) {
		car c1=new car(); // default constructor
		c1.display();// instance method
	}

}
