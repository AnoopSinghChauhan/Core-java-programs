import java.util.ArrayList;



class ArrayList_HasCode
{
	public static void main (String args[])
	{
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(15);
		al1.add(25);
		al1.add(35);
		al1.add(42);
		al1.add(85);
		System.out.println(al1.hashCode());
	}
}