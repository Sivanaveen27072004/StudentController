package com.mec.studentcontroller;

public class Student {
	private static String universityName="mec";
	private String name;
	private int regno;
	private int marks;
	private long phonenumber;
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception
	{
		if(name.equals("-------")) throw new Exception();
		this.name = name;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) throws Exception
	{
	if(regno<1) throw new ValidateRegNumberException(regno);
		this.regno = regno;
	}
	public int getMarks()
	{
		return marks;
	}
	public void setMarks(int marks) throws Exception 
	{
		if(marks<0) throw new ValidMarksException(marks);
		this.marks = marks;
	}
	public long getPhonenumber() 
	{
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) throws Exception
	{
		String s=""+phonenumber;
		if(s.length()<10) throw new ValidPhoneNumberException(phonenumber);
		this.phonenumber = phonenumber;
	}
	
	

}
class ValidateRegNumberException extends Exception
{
	public ValidateRegNumberException(int id)
	{
		System.out.println("invalid id "+id);
	}
}
//another class
class ValidMarksException extends Exception
{
	public ValidMarksException(int marks)
	{
		System.out.println("invalid mark "+marks);
	}

}

class ValidPhoneNumberException extends Exception
{
	public ValidPhoneNumberException(long phonenumber)
	{
		String s=""+phonenumber;
		System.out.println("Phone number should be in 10 digits and the curren length is "+s.length());
	}
}
// Another class
package com.mec.studentcontroller;

public class StudentController {
	public static void main(String[] args) throws Exception
	{
		Student s1=new Student();
		s1.setName("siva");
		s1.setRegno(30);
		s1.setMarks(80);
		s1.setPhonenumber(9348765390l);
		System.out.println(s1.getName());
		System.out.println(s1.getRegno());
		System.out.println(s1.getMarks());
		System.out.println(s1.getPhonenumber());
	}

}
