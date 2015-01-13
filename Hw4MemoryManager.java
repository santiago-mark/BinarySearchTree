import java.lang.Error;

/**
 Manages memory for nodes of a binary search tree.
 @author Mark Santiago
 */
public class Hw4MemoryManager 
{
	int[] memory; //the data
	private int freeHead; // the head of the list
	/**
	 Creates a memory manager for nodes. 
	 @param numNodes The number of nodes that the memory manager can hold.
	 */
	Hw4MemoryManager(int numNodes)
	{
		freeHead = 0;
		memory = 4 * numNodes;
	}
	
	/**
	 Allocates memory.
	 @return temp the next node.
	 @throws OutOfMemoryError No more memory available.
	 */
	Hw4Node allocate() throws OutOfMemoryError
	{
		if (freeHead < 0)
		{
			throw new OutOfMemoryError();
		}
		
		else
		{
			int temp = freeHead;
			freeHead = freeHead.next;
			temp.value = 0;
			node = new Hw4Node(this,temp);
			return temp;
		}
	}
	
	/**
	 Adds to free-space list pointed to be free head.
	 @param node the node being added to the list
	 @throws IndexOutOfBoundsException position is incorrect
	 @throws NullPointerException pointer is impossible
	 */
	public void freeNode(Hw4Node node) throws IndexOutOfBoundsException, NullPointerException
	{
		if (node.current < 0 || node.current > memory.length)
		{
			throw new IndexOutOfBoundsException();
		}
		else if (memory[node.current] < 0)
		{
			throw new NullPointerException();
		}
		else
		{
			node.value = -1;
			node.next = freeHead;
			freeHead = node;
		}
	}
	
	/**
	 Prints each number in the manager's memory.
	 */
	public void printMemory()
	{
		for (int i = 0; i < memory.length; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
