package assi_3;

public class Pro9 {

	public static void main(String[] args) 
	{
		System.out.println("This is Main Thread Demo...!");
		
		Thread t = Thread.currentThread();
		
		System.out.println("Name : " + t.getName());
	}

}
