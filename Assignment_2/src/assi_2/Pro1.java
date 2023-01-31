package assi_2;

public class Pro1 
{
		public static void main(String[] args) {
		
		Local a = new Local();
		a.L_var();
		
		Instance b = new Instance();
		b.I_var();
		
		//Test c = new Test();
		//Test d = new Test();
		Test.C_var();
		Test.C_var();
	}
}
class Local
{
	void L_var()
	{
		int no = 15; //Local Variable
		System.out.println("no :- Local Variable "+ no);
	}
}

class Instance
{
	int rollno = 10; //Instance Variable
	void I_var()
	{
		System.out.println("Roll No :- Instance Variable " + rollno);
	}
}

class Test
{
	static int age = 25; //Class Variable
	static void C_var()
	{
		System.out.println("Age :- Class Variable " + age++);
	}
}