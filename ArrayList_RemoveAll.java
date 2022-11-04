import java.util.ArrayList;
import java.util.Iterator;


class ArrayList_RemoveAll
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
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(75);
		al2.add(25);
		al2.add(98);
		al2.add(45);
		al2.add(14);
		al2.add(95);
		al2.add(75);
		al.addAll(al2);
		
		for(Integer z : al)
		{
			System.out.println(z );
		}
		al.removeAll(al2);
		for(Integer z : al)
		{
			System.out.println(z );
		}
	
	}
}