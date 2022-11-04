import java.util.ArrayList;



class ArrayList_ToArray
{
	public static void main (String args[])
	{
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(75);
		al1.add(25);
		al1.add(98);
		al1.add(45);
		al1.add(5);
		al1.add(145);
		al1.add(485);
		al1.add(15);
		
		Object w[] =al1.toArray();
		
		for(Object r : w)
		{
			System.out.println(r);
		}
	}
}