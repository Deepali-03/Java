



class StringOperation
{
      public static void main(String arr[])
     {
	String s1=new String("Hello java");
	String s2=new String("test.jpeg");
	System.out.println(s1);
	System.out.println(s1.length());//return total numbrt of char in string.
	System.out.println(s1.isEmpty());//check string has a value or not.
	System.out.println(s1.charAt(0));//return character from given index.
	
	System.out.println(s1.equals(s2));//to compair values of two string
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.startsWith("Hello"));
	System.out.println(s2.endsWith(".jpeg"));

	System.out.println(s2.indexOf('t'));
	System.out.println(s2.lastIndexOf('t'));
	
	String s3="Hello Java Program, This is Java String Program.";
	System.out.println(s3.substring(6));//to get specific part of string by index  
	System.out.println(s3.substring(6,10));//to get specific part of string by 				          		         start index and end index +1
	System.out.println(s3.replaceAll("Java","CPP"));
	System.out.println(s3.toUpperCase());
	System.out.println(s3.toLowerCase());
	System.out.println(s3);
	
	String s4="welcome";//emoclew
	char ch[]=s4.toCharArray();
	System.out.println(s4);
	for(int i=ch.length-1 ; i>=0 ; i--)
	{
		System.out.print(ch[i]);
	}
	System.out.println();
     }
}













