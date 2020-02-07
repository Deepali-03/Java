class StringSyntax
{
	public static void main(String arr[])
	{
		String str1="Java"; //created inside SCP
		String str2=new String("Java"); // created inside heap directly
		System.out.println(str1==str2); // false
		String str3="Java";
		String str4=new String("Java");
		System.out.println(str3==str4); // false
		System.out.println(str1==str3); //true
		System.out.println(str2==str4); // false
	}
}
