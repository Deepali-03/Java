//Write a program to display numbers between 1 to 100 which is divisble by 5 and 7
class ForLoop
{
	public static void main(String arr[])	
	{
		for(int num=1;num<=100;num++)
		{
			if(num%5==0 && num%7==0) 
				System.out.println(num);
		}		
	}
}