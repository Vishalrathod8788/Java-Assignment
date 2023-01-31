package assi_2;

public class Pro3
{
	void sum(int...a)
	{
		int sum=0;
		for(int x:a)
		{
			sum=sum+x;
		}
		System.out.println("sum:"+sum);
	}
	
	public static void main(String...args)
	{
		Pro3 a1 = new Pro3();
		a1.sum(1,2,3,4,5,6,7,8,9,10);
	}
}
