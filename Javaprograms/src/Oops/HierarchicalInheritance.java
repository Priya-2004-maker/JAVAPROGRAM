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
	class Cat extends Animal{
		void meow() {
			System.out.println("Cat Meow");
		}
	}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Dog d1=new Dog();
		Cat d2=new Cat();
		d1.bark();
		d2.meow();
		
	}

}
