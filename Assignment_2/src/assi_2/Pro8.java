package assi_2;

import java.util.Scanner;

class Person
{
	public String Name;
	public String Dob;
	public String Gender;
	
	Scanner sr = new Scanner(System.in);
	void get_stud_details()
	{
			System.out.print("Enter Name: ");
			this.Name = sr.next();
			System.out.print("Enter Date Of Birth: ");
			this.Dob = sr.next();
			System.out.print("Enter Gender: ");
			this.Gender = sr.next();
	}
}

class Student_details extends Person
{
	String Course="BCA";
	String University="SAURASHTRA UNIVERSITY";
	String College="HJD";
}

class Marks extends Student_details
{

	char Grade;
	int Sem,M1,M2,M3;
	float Avg;
	int n;
	void get_stud_marks()
	{
			System.out.print("Enter Your Sem: ");
			Sem = sr.nextInt();
			System.out.print("Enter Your First Subject Mark: ");
			M1 = sr.nextInt();
			System.out.print("Enter Your Second Subject Mark: ");
			M2 = sr.nextInt();
			System.out.print("Enter Your Third Subject Mark: ");
			M3 = sr.nextInt();
			Avg=(M1 + M2 + M3)/3;
	}
	
	void display()
	{
	System.out.print("Enter Number Of Student: ");
	n = sr.nextInt();
	System.out.println("___________________________________");
		for(int i=1; i<=n; i++)
		{
			get_stud_details();
			get_stud_marks();
			System.out.println("********** MARKSHEET **********");
			System.out.println("Name:"+Name);
			System.out.println("DOB:"+Dob);
			System.out.println("Gender:"+Gender);
			System.out.println("Course:"+Course);
			System.out.println("College:"+College);
			System.out.println("University:"+University);
			System.out.println("Sem:"+Sem);
			System.out.println("Mark_1:"+M1);
			System.out.println("Mark_2:"+M2);
			System.out.println("Mark_3:"+M3);
			System.out.println("Average:"+Avg);
			if(Avg>=90 && Avg<=100)
				System.out.println(Name+" Has Achived O Grade");
			else if(Avg>=80 && Avg<=89)	
				System.out.println(Name+" Has Achived A Grade");
			else if(Avg>=69 && Avg<=79)	
				System.out.println(Name+" Has Achived B Grade");
			else if(Avg>=60 && Avg<=69)	
				System.out.println(Name+" Has Achived C Grade");
			else if(Avg>=49 && Avg<=59)	
				System.out.println(Name+" Has Achived D Grade");
			else
				System.out.println("TRY AND TRY YOU WILL SUCCEED.......");
			
			System.out.println("********** @@@@@@ **********");
		}
	}
	
}

class Pro8 extends Student_details
{
	public static void main(String...args)
	{
		Marks s1 = new Marks();
		s1.display();
		
	}
}
