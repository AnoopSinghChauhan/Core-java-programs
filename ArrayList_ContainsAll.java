import java.util.ArrayList;



class ArrayList_ContainsAll
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
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(142);
		al2.add(12);
		al2.add(11);
		al2.add(25);
		al2.add(75);
		
		al1.addAll(al2);
	
		
		boolean bn = al1.containsAll(al2);
		
		
		System.out.println(bn);
	}
}