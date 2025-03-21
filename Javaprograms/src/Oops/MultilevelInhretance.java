package Oops;
class Animal{
	void sound() {
		System.out.println("Animals make Sounds");
	}
}
class Dog1 extends Animal{
	void bark() {
		System.out.println("Dog barks");
	}
}
	class Puppy extends Dog1{
		void weep() {
			System.out.println("Puppy weeps");
		}
	}
		
	public class MultilevelInhretance {
		public static void main(String[] args) {
			Puppy p1=new Puppy();
			p1.sound();
			p1.bark();
			p1.weep();
			
		}

}
