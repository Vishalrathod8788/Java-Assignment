package assi_3;

public class Pro7 {

	public static void main(String[] args) 
	{
		System.out.println("Program Start....");
			
		String name[] = {""};
		String address[] = {"Add1", "Add2", "Add3"};
		try {
			
			int x = 10/0;									// This is General Error
			System.out.println(name[1]);					// This is NullPointerException Error			
			System.out.println(address[3]);					// This is ArrayIndexOutOfBoundsException Error
		}
		catch (NullPointerException arr) 
		{
			System.out.println("Null Pointer Exception");
		}
		catch (ArrayIndexOutOfBoundsException arr) 
		{
			System.out.println("Array Index Out Of Bound");
		}
		catch (Exception e) 
		{
			System.out.println("General Error...!");
		}
		
		System.out.println("Program End....");
	}

}
