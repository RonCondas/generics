/*
Modify the MyList class that you wrote for Programming Challenge 1 so the type
parameter T should accept any type that implements the Comparable interface. Test the class in a
program that creates one instance of MyList to store Integers, and another instance to
store Strings.

*/

package generics;
import java.util.ArrayList;
import java.util.Collections;

public class MyListNew<T extends Comparable<T>> {
    private ArrayList<T> myList;

    /**
     * Constructor to initialize the ArrayList.
     */
    public MyListNew() {
        myList = new ArrayList<>();
    }

    /**
     * Adds an element of type T to the ArrayList.
     *
     * @param element The element to be added.
     */
    public void add(T element) {
        myList.add(element);
    }

    /**
     * Finds and returns the largest value in the ArrayList.
     *
     * @return The largest value in the ArrayList.
     */
    public T largest() {
        if (myList.isEmpty()) {
            return null; // Handle the case when the list is empty
        }

        return Collections.max(myList);
    }

    /**
     * Finds and returns the smallest value in the ArrayList.
     *
     * @return The smallest value in the ArrayList.
     */
    public T smallest() {
        if (myList.isEmpty()) {
            return null; // Handle the case when the list is empty
        }

        return Collections.min(myList);
    }

    public static void main(String[] args) {
        // Create an instance of MyList with Integer as the type parameter
    	MyListNew<Integer> integerList = new MyListNew<>();

        // Add elements to the list
        integerList.add(10);
        integerList.add(5);
        integerList.add(20);

        // Print the largest and smallest values
        System.out.println("Largest: " + integerList.largest());
        System.out.println("Smallest: " + integerList.smallest());

        // Create an instance of MyList with String as the type parameter
        MyListNew<String> stringList = new MyListNew<>();

        // Add elements to the list
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");

        // Print the largest and smallest values
        System.out.println("Largest: " + stringList.largest());
        System.out.println("Smallest: " + stringList.smallest());
    }
}
