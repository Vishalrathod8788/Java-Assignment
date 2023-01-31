package assi_2;

public class Pro2 
{
	static int sum;
	Pro2(int s)
	{
		this.sum+=s;
	}
	static void display()
	{
		
		System.out.println(" The sum is :- " + sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pro2 p= new Pro2(2);
		Pro2 p1= new Pro2(3);
		Pro2 p3= new Pro2(4);	
		display();
	}
}
