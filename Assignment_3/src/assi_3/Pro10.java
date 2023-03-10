package assi_3;

public class Pro10 extends Thread
{
	public void run()
	{
		while(true)
		{
			try 
			{
				Thread.sleep(1000);
				System.out.println("Download...");
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Pro10 p = new  Pro10();
		p.start();
	}
}
