// This is the Abstract class with the mixed duplicates from the ArrayList and LinkedList

public class AbstractList {

	// post: returns the current number of elements in the list
	public int size() {
		return size;
	}

	// pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
	// post: returns the value at the given index in the list
	public E get(int index) {
		checkIndex(index);
		return elementData[index];
	}

	// post: returns true if list is empty, false otherwise
	public boolean isEmpty() {
		return size == 0;
	}

	// post: returns true if the given value is contained in the list,
	//       false otherwise
	public boolean contains(E value) {
		return indexOf(value) >= 0;
	}
}

