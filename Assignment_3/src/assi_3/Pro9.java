package assi_3;

public class Pro9 {

	public static void main(String[] args) 
	{
		System.out.println("This is Main Thread Demo...!");
		
		Thread t = Thread.currentThread();							// Current Thread 
		
		System.out.println("Name : " + t.getName());
		
		t.setName("MAIN THREAD...!");								// Thread Name Changes
		
		System.out.println("Change Name : " + t.getName());
		System.out.println("Thread Priority Name : " + t.getPriority());
		System.out.println("Thread Id : "+ t.getId());
		System.out.println("Thread Alive : "+t.isAlive());
		System.out.println("Thread Class Name : "+t.getClass());
		System.out.println("Thread MAX Priority : "+t.MAX_PRIORITY);
		System.out.println("Thread MIN Priority : "+t.MIN_PRIORITY);
		System.out.println("Thread Normal Priority : "+t.NORM_PRIORITY);
		System.out.println("Thread Active Count : "+t.activeCount());
		System.out.println("Main Thread : "+ t);
	}

}
