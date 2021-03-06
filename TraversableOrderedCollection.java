package dataStructures;

/**
 *	TraversableOrderedCollection interface
 *	Encapsulates the functionality for an OrderedCollection that can be traversed
 *	using an iterator
 *
 *	Written by Roger West, University of Illinois at Springfield
 */
public interface TraversableOrderedCollection<T extends Comparable<? super T>> extends OrderedCollection<T>
{

	/**
	 *	return a generic Iterator for the Collection
	 */
	public OrderedIterator<T> iterator();
	
	
	/**
	 *	return whether the Collection contains the specified item
	 */
	public boolean contains(T obj);

}