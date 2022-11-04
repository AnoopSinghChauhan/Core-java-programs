import java.util.ArrayList;



class ArrayList_IsEmpty
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
		
		int x = al1.size();
		System.out.println(x);
		
		al1.clear();
		
		System.out.println(al1.isEmpty());
	}
}