package Oops;
class Animal{
	void sound() {
		System.out.println("Animals make Sounds");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog barks");
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.bark();
		d1.sound();
		
	}

}
