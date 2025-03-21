package ExceptionHandling;

public class Exercise1 {
	public static void main(String[] args) {
		try {
			int num=10/0;// Arithemetic Exception
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero :"+e.getMessage());
		}finally {
			System.out.println("Execution Completed");
		}
	}

}
