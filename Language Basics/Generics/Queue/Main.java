class Queue<E>
{
	private E[] elements;
	private int head=0,tail=0;
	public void insert(E element) throws QueueFullException
	{
		if()
	}
	public E remove() throws QueueEmptyException
	{

	}
	boolean isFull()
	{
		return (tail+1)%elements.length==head;
	}
	boolean isEmpty()
	{
		return head==tail;
	}

}
class QueueEmptyException extends Exception
{
	System.out.println("Queue is empty");
}
class QueueFullException extends Exception
{
	System.out.println("Queue is full");
}

class Main
{
	public static void main(String args[])
	{
		
	}
	
}