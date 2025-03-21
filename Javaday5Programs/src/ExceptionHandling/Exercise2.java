package ExceptionHandling;
public class Exercise2 {
	static void checkAge(int age) {
		if(age < 18) {
			throw new IllegalArgumentException("Age must be 18 or older");
		}
		System.out.println("Access granted");
	}
	public static void main(String[] args) {
		try {
			checkAge(14); // will throw an exception
		}catch(IllegalArgumentException e) {
			System.out.println("Caught Exception:"+e.getMessage());
		}
		
	}

}
