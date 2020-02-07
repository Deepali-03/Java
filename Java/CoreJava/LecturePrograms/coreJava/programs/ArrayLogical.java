class ArrayLogical
{
	public static void main(String ar[])
	{
		int marks[][]={
			{76,56,87,87,76,98},
			{93,65,56,78,91,54},
			{78,65,43,32,87,95},
			{56,87,89,43,89,23},
			{45,76,81,54,23,87}
		};
		for(int percent[]:marks){
			int max=0;
			for(int p:percent){
				if(max<p){
					max=p;		
				}
			}
			System.out.println(max);
		}
	}
}