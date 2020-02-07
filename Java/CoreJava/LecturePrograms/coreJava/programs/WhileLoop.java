class WhileLoop
{
	public static void main(String arr[])	
	{
		int num=1; //declaration and initialization
		do
		{
			if(num%2==0) //statement(s)
				System.out.println(num);
			num++; //increment/decrement
		}while(num<=30); //condition 		
	}
}