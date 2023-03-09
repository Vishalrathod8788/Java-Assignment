package assi_3;

public class Pro5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d1 = new demo(49, "Vishal");
		d1.getId();
		d1.setId(1);
		d1.getName();
		d1.setName("VGR");
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