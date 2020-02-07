/*
Create a program which store the 5 students 6 sem. percentage
and print the highest percentation of each student.
*/

/**
	This class demo the multidimentational array.
	and also iterating this multi Dimentational array by enhance for 
*/
class ArrayMultiD
{
	public static void main(String arr[])
	{
	    int multiD[][]={{23,45,76},{23,65},{6,4,32,2,5},{65,3,2,45,76,67,34}};
	    for(int row[] : multiD)
	    {
		for(int col : row)
	    	{
			System.out.print(col);
			System.out.print("\t");
	    	}
		System.out.println();
	    }	
	}
}