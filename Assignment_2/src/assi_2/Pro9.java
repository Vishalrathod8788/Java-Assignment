package assi_2;

class x extends Marks
{
	public x()
	{
		System.out.println("Dafault Constuctor For Person class");
	}
	x(String name, String bdate,String gender)
	{
		this.Name=name;
		this.Dob=bdate;
		this.Gender=gender;
		System.out.println("Name: " + name + " DOB: "+ bdate + " Gender: "+gender);
	}
}

class y extends Marks
{
	y()
	{
		System.out.println("Dafault Constuctor For StudentDetail class");
	}
	y(String course, String collage, String university)
	{
		this.Course = course;
		this.College = collage;
		this.University = university;
		System.out.println("Course: " + course + " Collage " + collage + " University " + university);
	}
}

class z extends Marks
{
	z()
	{
		System.out.println("Dafault Constuctor For Marks class");
	}
	z(char garde,int sem, int m1, int m2, int m3)
	{
		this.Grade = garde;
		this.Sem = sem;
		this.M1 = m1;
		this.M2 = m2;
		this.M3 = m3;
		this.Avg = (m1+m2+m3)/3;
		System.out.println("Garde " + garde + " Sem " + " Mark1 " + m1 + " Mark2 " + m2 + " Mark3 " + m3 );
	}
}

class Pro9
{
	public static void main(String...args)
	{	
		Person p = new x();
		Person p1 = new x("abc","22/10/1980","male");
		
		y s = new y();
		y s1 = new y("BCA", "HJD", "Shaurashtra University");
		
		Marks m = new z();
		Marks m1 = new z('A',1,55,66,77);
	}
}