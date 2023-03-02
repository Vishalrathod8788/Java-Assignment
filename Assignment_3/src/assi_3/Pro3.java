//Author : Vishal Rathod
//Date : 01/03/2023
//Time : 08:40 PM

package assi_3;

import java.util.Random;
import java.util.Scanner;

public class Pro3
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number :");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Random random = new Random();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(random.nextInt());
		}

	}
}
