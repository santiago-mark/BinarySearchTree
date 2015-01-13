/**
 Binary search tree using nodes maintained by memory manager.
 @author Mark Santiago
 */
public class Hw4Tree 
{
	Hw4Node root; //root of the tree
	Hw4MemoryManager manager; //memory manager for the node
	
	/**
	 Constructs a tree
	 @param m the memory manager
	 */
	Hw4Tree(Hw4MemoryManager m)
	{
		root = null;
		manager = m;
	}
	
	/**
	 Calls method to sort based on book's implementation of inserting into a tree.
	 @param value the value to be inserted
	 */
	public void insert(int value)
	{
		insert(root, value);
	}
	
	/**
	 Inserts a value into a tree
	 @param node the root of the tree
	 @param value the value to be inserted
	 */
	public void insert(Hw4Node node, int value)
	{
		Hw4Node n = null;
		Hw4Node temp = node;
		while (node != null)
		{
			n = temp;
			if (value < temp.value)
			{
				temp = temp.left;
			}
			else
			{
				temp = temp.right;
			}
		}
		node.parent = n;
		if (node == null)
		{
			root = node; //tree T was empty
		}
		else if (node.value < n.value)
		{
			n.left = node;
		}
		else
		{
			n.right = node;
		}
	}
	
	/**
	 Removes a value from a tree
	 @param value the value to be deleted
	 */
	public static void delete(int value)
	{
		
	}
	
	/**
	 Prints the smallest value in the tree.
	 */
	public void printMin()
	{
		while (root.left != null)
		{
			root = root.left;
		}
		System.out.println(root);
		System.out.println();
	}
	
	/**
	 Prints the largest value in the tree.
	 */
	public void printMax()
	{
		while (root.right != null)
		{
			root = root.right;
		}
		System.out.println(root);
		System.out.println();
	}
	
	/**
	 Searches the tree to see if the inputed value is in it. Prints the value if found.
	 @param value the value to search for
	 */
	public void printSearch(int value)
	{
		while (root != null && value != root.value)
		{
			if (value < root.value)
			{
				root = root.left;
			}
			else
			{
				root = root.right;
			}
		}
		
		if (root.value == value)
		{
			System.out.println(value);
		}
		else
		{
			System.out.println("NIL");
		}
	}
	
	/**
	  Calls method to print the tree in order based on book's implementation of ordering a tree.
	 */
	public void printInorder()
	{
		printInOrder(root);
	}
	
	/**
	 In order traversal of the tree and prints each value.
	 @param node the root of the tree of which the value is being printed
	 */
	public void printInOrder(Hw4Node node)
	{
		if (node != null)
		{
			printInOrder(node.left);
			System.out.print(node.value + " ");
			printInOrder(node.right);
		}
	}
}
