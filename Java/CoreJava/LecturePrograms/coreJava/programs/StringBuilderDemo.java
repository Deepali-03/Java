class StringBuilderDemo
{
	public static void main(String arr[])
	{
		StringBuilder sbr=new StringBuilder();
		System.out.println(sbr); //Hello
		sbr.append(" Java");//add value at the end of String
		System.out.println(sbr);
		sbr.insert(6,"StringBuilder ");//add value at specified location
		System.out.println(sbr);
		System.out.println(sbr.indexOf("Java"));		
		sbr.replace(20,24,"Cpp");//replace value at given index
		System.out.println(sbr);
		sbr.delete(5, 19);//delete string between start and end index+1 
		System.out.println(sbr);
		sbr.reverse();	   
		System.out.println(sbr);  //olleH

		sbr.append("Hello Hello Hello");
		System.out.println(sbr.length());//total number of char
		//default capacity is 16
		//if cross the capacity 1st time then it will increse by 16*2+2
		//if cross the double capacity then capacity will increse with length 
		System.out.println(sbr.capacity());//total number of char can hold
	}
}