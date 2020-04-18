package com.syntax.class26;

public class Doctor {
	
	private long licenceId;
	private long phoneNumber;
	private String email;
	
	public void setEmail(String email) { // --> here we are giving right to write the email
		if (!email.isEmpty()) {
			if (email.contains("gmail")) {
		this.email=email;
			}else {
				System.out.println("email must be gmail type");
			}
		}else {
	System.out.println("Emain cannot be empty");
		}
	}
	
	public String getEmail() { // here in get we have return
		
		return email;
	
	}
	
	

}
