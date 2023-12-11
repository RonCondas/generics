public class MyListClass<T extends Number> {
    private T xCoordinate; // The X coordinate
    private T yCoordinate; // The Y coordinate

    /**
     * Constructor
     *
     * @param x The X coordinate.
     * @param y The Y coordinate.
     */
    public MyListClass(T x, T y) {
        xCoordinate = x;
        yCoordinate = y;
    }

    /**
     * The setX method sets the X coordinate.
     *
     * @param x The value for the X coordinate.
     */
    public void setX(T x) {
        xCoordinate = x;
    }

    /**
     * The setY method sets the Y coordinate.
     *
     * @param y The value for the Y coordinate.
     */
    public void setY(T y) {
        yCoordinate = y;
    }

    /**
     * The add method adds an element to the array.
     *
     * @param array The array to which the element will be added.
     * @param element The element to be added.
     * @return A new array with the element added.
     */
    public T[] add(T[] array, T element) {
        T[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }
}

