import java.util.ArrayList;
import java.util.Iterator;


class ArrayList_Add
{
	public static void main (String args[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(75);
		al.add(25);
		al.add(98);
		al.add(45);
		al.add(14);
		al.add(95);
		al.add(75);
		
		Iterator	itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("****************");
		for(Integer z : al)
		{
			System.out.println(z );
		}
	
	}
}