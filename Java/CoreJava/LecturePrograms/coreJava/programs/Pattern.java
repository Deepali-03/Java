class Pattern
{
	public static void main(String arr[])	
	{
		for(int r=1;r<=4;r++)
		{
			
			for(int s=4;s>=r;s--)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}		
	}
}