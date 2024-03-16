package org.cons;

public class College extends Student {
	
	public College() {
		this(345);
		
		System.out.println("Constructor");
	}
	public College(int number,String name)
	{
		System.out.println("Parameterized Constructor "+number+", "+name);
	}
	public College(int age)
	{
		super();
		System.out.println("This class to call current class constructor" );
	}
	public static void main(String[] args)
	{
		College c = new College();
		College a = new College(12,"Sowmya");
		
	}

}







