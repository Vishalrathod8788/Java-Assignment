//Author : Vishal Rathod
//Date : 01/03/2023
//Time : 08:40 PM

package assi_3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Pro2 
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		System.out.println("Current Year:" + cal.get(cal.YEAR));
		
		System.out.println("Current Month:" +new SimpleDateFormat("MMMM").format(cal.getTime()));
		
	}
}
