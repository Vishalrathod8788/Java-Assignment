package assi_3;

import java.util.Vector;

class VectorDemo 
{
	private int no;
	private String name;

	int getNo(int no)
	{
		return no;
	}
	public VectorDemo(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}


	@Override
	public String toString() {
		return "No = " + no + " Name = " + name ;
	}

}
public class Pro4 {

	
		public static void main(String...args)
		{
			Vector v1 = new Vector();
			
			VectorDemo v = new VectorDemo(1, "Vishal");
			VectorDemo v0 = new VectorDemo(2, "VGR"); 
			
			v1.addElement("VGR");
			System.out.println("Vecor Size " + v1.size());
			v1.addElement(v);
			v1.addElement(v0);
			v1.insertElementAt("Vishal", 1);
			v1.addElement(v.getNo(1));
			
			
			for (int i = 0; i < v1.size(); i++)
			{
				System.out.println(i +" : "+v1.get(i));
			}
		}	
}
