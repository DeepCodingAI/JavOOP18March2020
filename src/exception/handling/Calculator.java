package exception.handling;

public class Calculator {

	public static void main(String[] args) {
	
		int num = 10;
		try {
			
		int result = num/0;
		System.out.println(result);
		
		}catch(Exception myError) {
		  System.out.println("You are not allowed to divide a number by Zero");
		}
		
		System.out.println("Did you get any error ?");
		
	}

}
