package practice.array;

import java.util.ArrayList;

public class ArrayTest {
	public static void main(String[] args) {
		
		ArrayList<String> str1 = new ArrayList<>();
		ArrayList<String> str2 = new ArrayList<>();
		
		str1.add("omkar");
		str1.add("vinu");
		str1.add("raj");
		str1.add("rohit");
		
		str2.add("ok");
		str2.add("krish");
		str2.add("vinu");
		str2.add("vinu");
		
		ArrayList<String> db = new ArrayList<>();
		
		for(int i = 0;i<str1.size();i++) {
			if(str2.contains(str1.get(i))){
				db.add(str1.get(i));
				System.out.println(str1.get(i));
			}
		}
		
	}
}
