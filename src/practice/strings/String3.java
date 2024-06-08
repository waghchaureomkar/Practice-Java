package practice.strings;

import java.util.ArrayList;

public class String3 {

	public static void main(String[] args) {

		String[] name = { "Vinayak", "Omkar", "Vinayak", "Omkar", "Omkar", "Surekha" };

		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<String> duplicate = new ArrayList<String>();
		
		

		for (int i = 0; i < name.length; i++) {
			if (arr.contains(name[i])) {
				if(!duplicate.contains(name[i]))
				duplicate.add(name[i]);
			} else {
				arr.add(name[i]);

			}
		}

		System.out.println(duplicate);

	}

}
