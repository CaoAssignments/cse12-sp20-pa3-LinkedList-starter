/** TODO: Add file header here
 *  
 */

import java.util.*;

/** TODO: Add class header here
 *  
 */

public class MyLinkedList<E> extends AbstractList<E> {

	int nelems;
	Node head;
	Node tail;

	protected class Node {
		E data;
		Node next;
		Node prev;

		public Node(E element)
		{
			/* Add your implementation here */
		}

		public void setPrev(Node p)
		{
			/* Add your implementation here */
		}

		public void setNext(Node n)
		{
			/* Add your implementation here */
		}

		public void setElement(E e)
		{
			/* Add your implementation here */
		}

		public Node getNext()
		{
			return (Node) null; // XXX-CHANGE-XXX
		}

		public Node getPrev()
		{
			return (Node) null; // XXX-CHANGE-XXX
		} 

		public E getElement()
		{
			return (E) null; // XXX-CHANGE-XXX
		} 
	}

	/** ListIterator implementation */ 
	protected class MyListIterator implements ListIterator<E> {

		boolean forward;
		boolean canRemoveOrSet;
		Node left,right;
		int idx;

		public MyListIterator()
		{
			/* Add your implementation here */			
		}

		@Override
		public void add(E e)
		{
			/* Add your implementation here */
		}

		@Override
		public boolean hasNext()
		{
			return false; // XXX-CHANGE-XXX
		}

		@Override
		public boolean hasPrevious()
		{
			return false; // XXX-CHANGE-XXX
		}

		@Override
		public E next()
		{
			return (E) null;  // XXX-CHANGE-XXX
		}

		@Override
		public int nextIndex()
		{
			return 0; // XXX-CHANGE-XXX			
		}

		@Override
		public E previous()
		{
			return (E) null; // XXX-CHANGE-XXX
		}

		@Override
		public int previousIndex()
		{
			return 0;  // XXX-CHANGE-XXX
		}

		@Override
		public void remove()
		{
			/* Add your implementation here */	
		}

		@Override
		public void set(E e) 
		{
			/* Add your implementation here */
		}
	}

	//  Implementation of the MyLinkedList Class
	/** Only 0-argument constructor is define */
	public MyLinkedList()
	{
	}

	@Override
	public int size()
	{
		// need to implement the size method
    	return 0; // XXX-CHANGE-XXX
	}

	@Override
	public E get(int index)
	{
		return (E) null;  // XXX-CHANGE-XXX
	}

	@Override
	public void add(int index, E data) 
	{
		/* Add your implementation here */
	}

	public boolean add(E data)
	{
		return true; // XXX-CHANGE-XXX
	}

	public E set(int index, E data) 
	{
		return (E) null; // XXX-CHANGE-XXX
	}

	public E remove(int index)
	{
		return (E) null; // XXX-CHANGE-XXX
	}

	public void clear()
	{
		/* Add your implementation here */
	}

	public boolean isEmpty()
	{
		return true;  // XXX-CHANGE-XXX
	}

	protected Node getNth(int index)
	{
		return (Node) null;  // XXX-CHANGE-XXX
	}

	public Iterator<E> iterator()
	{
		return null;
	}
	public ListIterator<E> listIterator()
	{
		return null;
	}

}

// VIM: set the tabstop and shiftwidth to 4 
// vim:tw=78:ts=4:et:sw=4