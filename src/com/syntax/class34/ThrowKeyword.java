package com.syntax.class34;
//class BalanceExceptiom extends RuntimeException{
//	public void BalanceException(int amount) {
//		super();
//	}
//}
public class ThrowKeyword {

	public static void main(String[] args) {
		
		// usually we will use throw keyword we are throwing exception explicitly
		//we can create our own custom exception
		// we can throw only one exception
		
		
		NullPointerException npe=new NullPointerException (); // here we are creating obj of exception
		
//		throw npe; // we are throwing exception explicitly
		
		
		
		// calling method throwException
	//	throwException();
		
		withdraw(100, 1000);
		
//		browser("fhkd");
		
	}
	
//	public static void put(int balance, int amount) {
//		if (amount<balance) {
//			throw new BalanceException("your amount is less than your balance"); // here we created our own exception, there is no such exception
																				// so we need to create our own exception
			
//		}
//	}
	
	// create a withdraw method for balance and amount
	public static void withdraw (int balance, int amount) {
		if (amount>balance) {
			throw new RuntimeException("your balance is to law"); // by using throw we are creating an exception 
																 // parent of ArithmeticException (RuntimeException)
			
		}
		
	}
	
	
	public static void throwException() {
		throw new ArithmeticException();
		
	}
	
	public static void browser(String browser) {
		switch (browser) {
		case "chrome":
			System.out.println("Using chrome browser");
			break;
		case "firefox":
			System.out.println("Using firefox browser");
			break;
			default:
				throw new RuntimeException("Invalid browser"); // we can pass any msg when we throw
		}
	
	
	for (int i = 0; i < 3; i++) {
		for (int j = 3; j >= 0; j--) {
	
	if (i == j)
	continue;
	System.out.println(i + " " + j);
	

}
}
	}}
	
