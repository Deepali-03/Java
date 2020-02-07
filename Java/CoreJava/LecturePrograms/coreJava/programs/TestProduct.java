class Product 
{
	int id;
	double price;
	public void set(int i,double p)
	{
		id = i;
		price = p;
	}
}
public class TestProduct
{
	public static void main(String arr[])
	{
		Product Product_1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		p1.set(12,567.56);
		p2.set(54,7654.45);
		p3.set(33,654.6);
		double avg = (p1.price+p2.price+p3.price)/3;
		System.out.println(avg);
	}
} 








