package assi_3;

import java.util.StringTokenizer;

public class Pro6 
{
	public static void main(String[] args) 
	{
		String str = "hello;i:study;in:Bhavans's;shree:H.J.;Doshi;IT:Institute";
		StringTokenizer st = new StringTokenizer(str, ";:'.");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
