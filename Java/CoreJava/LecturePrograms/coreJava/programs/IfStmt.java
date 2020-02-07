class IfStmt
{
	static boolean b;
	public static void main(String arg[])
	{
		int age=10;
		if(age>=1 && age<=120)
		{
			if(age>=1 && age <=17)
				System.out.println("Child Age");
			else if(age>=18 && age <=24)
				System.out.println("Teen Age");
			else if(age>=24 && age <=60)
				System.out.println("Young Age");
			else if(age>=61 && age <=120)
				System.out.println("Old Age");
		}
		else
		{
			System.out.println("Invalid Age");
		}		
	
	}
}