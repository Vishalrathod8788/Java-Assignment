package assi_3;

public class Pro12 {

	public static void main(String[] args) 
	{
		First target=new First();
		Secound ob1=new Secound(target,"I");
		Secound ob2=new Secound(target,"LOVE");
		Secound ob3=new Secound(target,"JAVA");
		try
		{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

}
class First
{
	synchronized void call(String str)
	{
		System.out.print("["+str);
		try
		{
			Thread.sleep(1000);
		} 
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
		System.out.print("]");
	}
}

class Secound implements Runnable
{
	String str;
	First target;
	Thread t;
	public Secound(First targ,String s)
	{
		target=targ;
		str=s;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		target.call(str);
	}
}
