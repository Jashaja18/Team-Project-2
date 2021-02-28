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
	// current number of elements in the list
	public int size;

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
	public String toString() 
	{
		String string = "[";
		Iterator<E> iter = this.iterator();

		if(iter.hasNext())
		{
			string += iter.next();
		}
		
		while(iter.hasNext())
		{
			string +=  ", " + iter.next();
		}
		
		return string + "]";
	}

	// post: appends the given value to the end of the list
	// Jashanpreet
	public void add(E value) 
	{
		
	}
	
	public void add(int index, E value)
	{
		
	}
	
	// post: list is empty
	// Jashanpreet
	public void clear() 
	{
		Iterator<E> itrE = this.iterator();
		while(itrE.hasNext()) 
		{
			itrE.next();
			itrE.remove();
		}
	}
	
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
	
	// Jashanpreet
	public void remove(int index) 
	{
		Iterator<E> iter = this.iterator();
		for (int i = 0; i < size; i++) 
		{
			iter.next();
			if (index == i)
			{
				iter.remove();
				size--;
				return;
			}
		}
	}
	
	public abstract Iterator<E> iterator();
}
