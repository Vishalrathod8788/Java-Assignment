package assi_3;

public class Pro12 {

	public static void main(String[] args) 
	{
		
	}

}
class First
{
	synchronized void call(String str)
	{
		System.out.println("["+str);
		try
		{
			Thread.sleep(1000);
			
		} 
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}