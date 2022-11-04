import java.util.ArrayList;
import java.util.Iterator;


class ArrayList_AddAll
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
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(75);
		a2.add(25);
		a2.add(98);
		a2.add(45);
		a2.add(14);
		a2.add(95);
		a2.add(75);
		
		al.addAll(a2);
		
		for(Integer z : al)
		{
			System.out.println(z );
		}
	
	}
}