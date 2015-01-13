import java.lang.Object;
import java.lang.Enum;
/**
 Represents a node in a binary search tree.
 @author Mark Santiago
 */

class Hw4Node 
{
	Hw4MemoryManager manager; //memory manager that the node belongs to
	int current; //the node being represented
	
	int value; //the value of the node
	static Hw4Node parent;//the parent of the node
	static Hw4Node left; //the left child of the node
	static Hw4Node right; //the right child of the node
	
	
	/**
	 Creates a node.
	 @param m the memory manager
	 @param nodeLocation the position of the node
	 */
	Hw4Node(Hw4MemoryManager m, int nodeLocation)
	{
		manager = m;
		current = nodeLocation;
	}
	
	/**
	 Sets the value of the node
	 @param value of the node
	 */
	Hw4Node(int value)
	{
		this.value = value;
	}
	
	public enum NodeComponent{current, value, parent, left, right}
	
	/**
	 Obtain the value of the node
	 @param type the type of the node component
	 @return the value
	 */
	int get(NodeComponent type)
	{
		if (type.equals(current))
		{
			return current;
		}
		else
		{
			
		}
	}
	
	/**
	 Gets the node 
	 @param type the type of the node component
	 @return a Hw4Node
	 */
	Hw4Node getNode(NodeComponent type)
	{
		
	}
	
	/**
	 Uses type to set component of node in memory manager to value.
	 @param type the type of the node component
	 @param value the value to be set
	 */
	public void set(NodeComponent type, int value)
	{
		
	}
}
