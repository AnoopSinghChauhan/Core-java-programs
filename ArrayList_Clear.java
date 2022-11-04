import java.util.ArrayList;



class ArrayList_Clear
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
		
		int sz = al1.size();
		
		System.out.println("Array Size ="+sz);
		
		al1.clear();
		
		sz= al1.size();
		System.out.println("Array Size "+sz);
	}
}