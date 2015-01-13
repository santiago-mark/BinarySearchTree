/**
 Test the Hw4 programs.
 @author Mark Santiago
 */
public class Hw4 
{
	public static void main (String args[])
	{
		String[] data  = new String[args.length];
		Hw4MemoryManager memory = new Hw4MemoryManager;
		
		for (int i = 0; i < args.length; i++)
		{
			if (Integer.parseInt(data[i]) == (int)data[i])
			{
				
			}
			if (data[i].equals("mem"))
			{
				
			}
			if (data[i].equals("min"))
			{
				printMin();
			}
			if (data[i].equals("max"))
			{
				printMax();
			}
			if (data[i].equals("sort"))
			{
				printInOrder();
			}
			if (data[i].equals("s" + ))
			{
				
			}
		}
	}
}
