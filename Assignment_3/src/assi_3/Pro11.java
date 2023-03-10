package assi_3;

public class Pro11 implements Runnable 
{

	@Override
	public void run() 
	{
		while(true)
		{
			try 
			{
				Thread.sleep(1000);
				System.out.println("Upload...");
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) 
	{
		Pro11 p11 = new Pro11();
		Thread t = new Thread(p11);
		t.start();
	}
	
}
