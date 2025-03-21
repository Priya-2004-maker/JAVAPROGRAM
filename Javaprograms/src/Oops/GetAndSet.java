package Oops;
class Data1{
	private String name; // private field
	//getter method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && !name.isEmpty()) {
			this.name=name;
		}else {
			System.out.println("Invalid Name!");
		}
	}
	
}

public class GetAndSet {
	public static void main(String[] args) {
		Data1 s1=new Data1();
		// set the name using the setter
		s1.setName("Priya");
		System.out.println("Student Name: "+s1.getName());
	}

}
