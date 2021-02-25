/**
 * Thais snd Jashanpreet
 * Feb 23 2021
 * CS 211
 * Team Project 2
 */
// This is the Abstract class with the mixed duplicates from the ArrayList and LinkedList

abstract public class AbstractList<E>
{
    private int size;        // current number of elements in the list
    private E[] elementData; // list of values

    // post: returns the current number of elements in the list
    public int size()
    {
        return size;
    }

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: returns the value at the given index in the list
    public E get(int index)
    {
        checkIndex(index);
        return elementData[index];
    }

    // post: returns true if list is empty, false otherwise
    public boolean isEmpty()
    {
        return size == 0;
    }

    // post: throws an IndexOutOfBoundsException if the given index is
    //       not a legal index of the current list
    private void checkIndex(int index)
    {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }
}
