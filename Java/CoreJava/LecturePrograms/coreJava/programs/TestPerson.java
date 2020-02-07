public class TestPerson
{
	public static void main(String arr[])
	{
		Person per; //reference variable of type Person
		per = new Person();//Object of person class
		System.out.println(per);
		per.setData(112,'M');//calling function by using object
		per.getData();
	}
}

class Person
{
	int uid;
	char gender;
	
	public void setData(int u,char g)
	{
		int uid=11;
		uid=u;
		gender=g;
	}
	public void getData()
	{
		System.out.println(uid);
		System.out.println(gender);
	}

}







