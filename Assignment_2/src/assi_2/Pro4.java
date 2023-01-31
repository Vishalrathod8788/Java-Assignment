package assi_2;

public class Pro4 
{

	void outSum(int ...x)
	{
		int outSum=0;
		System.out.println("Total Arguments: "+x.length);
		for(int a : x)
		{
			outSum += a;
		}
		System.out.println("Sum Of Outer Class : " + outSum);
	}
	
	class inner
	{
		void sum(int ...a)
		{
			int inSum=0;
			System.out.println("Total Arguments: "+a.length);
			for(int x : a)
			{
				inSum += x;
			}
			System.out.println("Sum Of Inner Class : " + inSum);
		}
	}

	public static void main(String ...args)
	{
		Pro4 p = new Pro4();
		p.outSum(1,2,3);
		Pro4.inner q = p.new inner();
		q.sum(1,3,4);		
	}
}
