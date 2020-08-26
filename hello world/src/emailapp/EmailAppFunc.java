package emailapp;

import java.util.Scanner;

public class EmailAppFunc 
{
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String department;
	private int capacity = 500;
	private String alternatemail;
	private String parentcompany = "akshitproduction.com";
	
	//constructor  
	public EmailAppFunc(String firstname, String lastname)
	{
		this.firstname	 = firstname;
		this.lastname = lastname;
//		System.out.println(this.firstname + this.lastname);
		this.department = setDepartment();
//		System.out.println("department is : "+this.department);
		this.password = randomPassword(6);
		System.out.println("your password is :"+this.password);
		email  =firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department.toLowerCase()+"."+
				parentcompany;
		System.out.println("Your Email id generated is : "+email);
	}
	
	private String setDepartment() {
		System.out.print("enter the department \n1 for Sales \n2 for Accounting\n3 for HR");
		Scanner in = new Scanner(System.in);
		
		int choice = in.nextInt();
		if(choice == 1)	return "Sales";
		else if(choice==2 ) return "Accounting";
		else if(choice==3) return "HR";
		else return "info";
		
	}
	private String randomPassword(int length)
	{
		String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890!@#$%^&*";
		char[] password = new char[length];
		for(int i = 0;i<length;i++) {
			int rand  = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public void setcapacity(int capacity)
	{
		this.capacity = capacity;
	}
	public void setAlternatemail(String altmail)
	{
		this.alternatemail = altmail;
	}
	public void setPassword(String password) {
		this.password  = password;
	}
	
}
