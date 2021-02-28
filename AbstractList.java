/**
 * Thais snd Jashanpreet
 * Feb 23 2021
 * CS 211
 * Team Project 2
 */

//This is the Abstract class with the mixed duplicates from the ArrayList and LinkedList
import java.util.*;

public abstract class AbstractList<E> implements List<E>
{
	public int size; // current number of elements in the list

	// post: returns the current number of elements in the list
	public int size()
	{
		return size;
	}
	
	public AbstractList() 
	{
		size = 0;
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
		if (index < 0 || index >= size()) 
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
	
	// Standard Java toString
	// Jashanpreet
	public abstract String toString()
	{
		public int indexOf(E value) 
		{
			for(int i = 0; i < size(); i++) 
			{
				if(value.equals(i))) 
				{
					return i;
				}
			}
		}
	}

	// post: appends the given value to the end of the list
	// Jashanpreet
	public void add(E value) 
	{
		add(size(), value);
	}

	/* post: list is empty
	// Jashanpreet
	public void clear() 
	{
		Iterator<E> itrE = this.iterator();
		while(itrE.hasNext()) 
		{
			itrE.next();
			itrE.remove();
		}
	}*/
	
	// imports the iterator of the List and returns them 
	// Jashanpreet
	public E get(int index)
	{
		Iterator<E> list = iterator();
		E num = null;
		for(int i = 0; i < index; i++) 
		{
			num = list.next();
		}
		return num;
	}
	
	public abstract void add(int index, E value);
	public abstract void clear();
	public abstract void set(int index, E value);
	public abstract Iterator<E> iterator();
}
