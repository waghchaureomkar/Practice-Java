package practice.strings;

import java.util.ArrayList;

public class String1 {
	public static void main(String[] args) {

		String data = "kiviaaaaaaaaanayakk";

		String[] d = data.split("");

		ArrayList<String> arr = new ArrayList<>();
		ArrayList<String> db = new ArrayList<>();
		for (String element : d) {

			if (arr.contains(element)) {
				if (!db.contains(element))
					db.add(element);
			} else {
				arr.add(element);

			}

		}
		System.out.println("==" + db);

	}

}
