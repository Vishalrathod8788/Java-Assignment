package assi_2;

public class Pro6 
{

	 final int speed=40;
	
	void change(int a)
	{
		//speed=a;//can't assign a value to final variable speed
		System.out.println("New Speed:"+speed);
	}
	
	public static void main(String...args)
	{
			Pro6 p =new Pro6();
			p.change(70);//can't assign a value to final variable speed
			
			
	}
}
