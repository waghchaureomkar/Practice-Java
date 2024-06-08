package practice.strings;

import java.util.ArrayList;

public class String2 {

	public static void main(String[] args) {

		String s ="vinayakvinayakvinayak";
		
		String c[]=s.split("");
		
		ArrayList<String> arr=new  ArrayList<String>();
		ArrayList<String> dup=new  ArrayList<String>();
		for(int i=0;i<c.length;i++)
		{
			
			if(arr.contains(c[i]))
			{
				dup.add(c[i]);
			}
			else
			{
				arr.add(c[i]);
			}
		}

		System.out.println(arr);
		
		
	}

}
