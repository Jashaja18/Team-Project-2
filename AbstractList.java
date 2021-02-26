/**
 * Thais snd Jashanpreet
 * Feb 23 2021
 * CS 211
 * Team Project 2
 */
// This is the Abstract class with the mixed duplicates from the ArrayList and LinkedList

import java.util.*;

public abstract class AbstractList<E> implements List<E>
{
    public int size; // current number of elements in the list

    // post: returns the current number of elements in the list
    public int size()
    {
        return size;
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
        if (index < 0 || index >= size) 
        {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }
    
    // post: returns true if the given value is contained in the list,
    //       false otherwise
    public boolean contains(E value) 
    {
        return indexOf(value) >= 0;
    }
    
    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: replaces the value at the given index with the given value
    public void set(int index, E value) 
    {
        checkIndex(index);
    }
    
    // post: appends all values in the given list to the end of this list
    public void addAll(List<E> other) 
    {
        for (E value: other) 
        {
            add(value);
        }
    }
    
    // post: list is empty
    // Jashanpreet Jandu
    public void clear() 
    {
        Iterator<E> itrE = this.iterator();
        while(itrE.hasNext()) 
        {
             itrE.next();
             itrE.remove();
        }
    }
}
