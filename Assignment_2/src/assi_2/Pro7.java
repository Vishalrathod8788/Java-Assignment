package assi_2;

class A
{
	A()
	{
		System.out.println("Class A");
	}
	int a,b;
	
	void sum(int x, int y)
	{
		a=x;
		b=y;
		System.out.println("Perent class Sum: "+(a+b));
	}
}


class Pro7 extends A
{
	Pro7()
	{
		System.out.println("Class Pro7");
	}
	int x,y;
	
	void sum(int a, int b)
	{
		super.sum(a,b);
		x=a;
		y=b;
		System.out.println("Child class Sum: "+(x+y));
	}
	
	public static void main(String...args)
	{
		Pro7 p = new Pro7();
		p.sum(10,5);
	}
}