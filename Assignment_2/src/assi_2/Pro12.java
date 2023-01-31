package assi_2;

abstract class abs
{
	int a,b;
	public void sum(int x, int y)
	{
		this.a = x;
		this.b = y;
		System.out.println("Sum Of "+ (a + b) );
	}
	abstract void abs();
}

public class Pro12 extends abs{

	@Override
	void abs() {
		// TODO Auto-generated method stub
		System.out.println("This Method Is Abstact");
	}
	
	public static void main(String[] args)
	{
		Pro12 p = new Pro12();
		p.abs();
	}
}
