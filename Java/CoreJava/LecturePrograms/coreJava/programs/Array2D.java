class Array2D
{
	public static void main(String arr[])
	{

	//declaration of 2D array first bracket is for row and another for column
	    int array[][];

	    array=new int[3][2];//instance creation of 2D array

	    array[0][1]=30;//initialization of array

	    System.out.println(array.length);//return the total number of rows

	//return the total number of columns from 2nd row
	    System.out.println(array[2].length);
	}
}