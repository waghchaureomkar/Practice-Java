package practice.strings;

import java.util.ArrayList;

public class String3 {

	public static void main(String[] args) {

		String[] name = { "Vinayak", "Omkar", "Vinayak", "Omkar", "Omkar", "Surekha" };

		ArrayList<String> arr = new ArrayList<>();
		ArrayList<String> duplicate = new ArrayList<>();



		for (String element : name) {
			if (arr.contains(element)) {
				if(!duplicate.contains(element))
				duplicate.add(element);
			} else {
				arr.add(element);

			}
		}

		System.out.println(duplicate);

	}

}
