package generics;


	public class MyListClass<T extends Number>
	{
	private T xCoordinate; // The X coordinate
	private T yCoordinate; // The Y coordinate

	/**
	Constructor
	@param x The X coordinate.
	@param y The Y coordinate.
	*/

	public MyListClass(T x, T y)
	{
	xCoordinate = x;
	yCoordinate = y;
	}

	/**
	The setX method sets the X coordinate.
	@param x The value for the X coordinate.
	*/


	//INSERT INFO HERE
	//PLEASE HELP!!!
	public void add(T[] array, int i)
	{
	int[] newArray = new int[array.length];
	System.arraycopy(array, 0, newArray, 0, array.length);
	newArray[newArray.length - 1] = i;
	return newArray;
	}



	}

