package dataStructures;

/**
 *	Stack interface
 *	Encapsulates the basic functionality for a stack: a LIFO data structure in
 *	which access is limited to the item at the top of the stack; i.e., the next
 *	item that can be accessed is the item that was most recently added
 *
 *	The canonical stack methods are provided, although technically they are not
 *	necessary:
 *		peek == get
 *		pop == remove
 *		push == add
 *
 *	Written by Roger West, editted by Elham s.Buxton, University of Illinois at Springfield 
 *	Adapted from code written by Mark Weiss in Data Structures and Problem
 *	Solving Using Java, 2nd edition, 2002
 */
public interface Stack<T> extends Collection<T>
{

	/**
	 *	return the item at the top of the stack; the item is not removed
	 */
	public T peek();


	/**
	 *	remove the item at the top of the stack
	 */
	public T pop();


	/**
	 *	add the specified item to the top of the stack
	 */
	public boolean push(T obj);

}





