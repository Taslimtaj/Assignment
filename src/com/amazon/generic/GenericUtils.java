package com.amazon.generic;

public class GenericUtils 
{

	public static int removeCommas(String price)
	{
		String[] a=price.split(",");
		String strFullPrice="";
		for(int i=0;i< a.length; i++)
		{
			strFullPrice +=a[i];
			
		}
		return Integer.parseInt(strFullPrice);
		
		
	}
}
