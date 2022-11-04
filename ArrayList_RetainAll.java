import java.util.ArrayList;



class ArrayList_RetainAll
{
	public static void main (String args[])
	{
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(75);
		al1.add(25);
		al1.add(98);
		al1.add(45);
	
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(75);
		al2.add(25);
		al2.add(45);
		
		al1.addAll(al2);
		for(Integer w : al1)
		{
			System.out.println(w);
		}
		System.out.println("***************");
		al1.retainAll(al2);
		for (Integer w : al2)
		{
			System.out.println(w);
		}
		
		
	}
}