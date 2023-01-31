package assi_2;

class Clg
{
	static String clg_nm="HJD";
	String University="GTU";
}

class Student extends Clg
{
	int no;
	String name;
	String University="SAU";
	
	Student(int no,String name)
	{
		this.no=no;
		this.name=name;
		System.out.println("***********************");
		System.out.println("No:"+no+"\nNAME:"+name);
		System.out.println("COLLEGE_NAME:"+clg_nm);
		System.out.println("UNIVERSITY_NAME:"+super.University);
		System.out.println("***********************");
	}	
	
	
}
class Pro5
{
	public static void main(String...args)
	{
		Student s1 =new Student(101,"ABC");
		
	}
}