/* Group #4, CS211, 3/1/21, Team Project #2
 * Jashanpreet, Thais, Shreya, Brandon, Doris, Ace
 * Generic interface for a List of E objects
 */

public interface List<E> extends Iterable<E> 
{
	public int size();
	public E get(int index);
	public int indexOf(E value);
	public boolean isEmpty();
	public boolean contains(E value);
	public void add(E value);
	public void add(int index, E value);
	public void addAll(List<E> other);
	public void remove(int index);
	public void set(int index, E value);
	public void clear();
}
