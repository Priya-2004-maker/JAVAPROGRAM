package Oops;
class Student{
	public String name="Raj";// public-Access from anywhere
	private int age=20;// private-Access only in this class
	protected String grade="A";//protected Access in the same class
	String school="ABC School";// Default-Access in the same class and same package
	 public void displayInfo() {
		 System.out.println("Name: "+name);
		 System.out.println("Age: "+age);
		 System.out.println("Grade: "+grade);
		 System.out.println("School: "+school);
		}
}
public class AccessDemo {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.displayInfo();
		System.out.println("Public Name: "+s1.name);
		//System.out.println("Private Age: "+s1.age);
		//System.out.println("Protected Grade: "+s1.grade);
		System.out.println("Default School: "+s1.school);
		
	}

}
