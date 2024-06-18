package practice.strings;

import java.util.ArrayList;

public class String2 {

	public static void main(String[] args) {

		String s ="vinayakvinayakvinayak";

		String c[]=s.split("");

		ArrayList<String> arr=new  ArrayList<>();
		ArrayList<String> dup=new  ArrayList<>();
		for (String element : c) {

			if(arr.contains(element))
			{
				dup.add(element);
			}
			else
			{
				arr.add(element);
			}
		}

		System.out.println(arr);


	}

}
