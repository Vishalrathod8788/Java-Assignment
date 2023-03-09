package assi_3;

import java.util.Hashtable;

public class Pro5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht = new Hashtable();
		demo d1, d2;
		d1 = new demo(1, "Vishal");
		ht.put(d1.getId(), d1);
		d1 = new demo(2, "VGR");
		ht.put(d1.getId(), d1);
		d2 = (demo) ht.get(2);
		System.out.println(d2.getName());
		System.out.println(d2.getId());
		System.out.print("\n");
		d2 = (demo) ht.get(1);
		System.out.println(d2.getId());
		System.out.println(d2.getName());
	}

}
class demo
{
	int id;
	String name;
	public demo(int id, String name)
	{
			this.id=id;
			this.name=name;
	}
	
	public int getId()
	{
		System.out.println(id);
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
		System.out.println(id);
	}
	
	public String getName()
	{
		System.out.println(name);
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
		System.out.println(name);
	}
	
}