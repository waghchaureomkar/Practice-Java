package practice.strings;

import java.util.ArrayList;

public class String1 {
	public static void main(String[] args) {

		String data = "kiviaaaaaaaaanayakk";

		String[] d = data.split("");

		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<String> db = new ArrayList<String>();
		for (int i = 0; i < d.length; i++) {

			if (arr.contains(d[i])) {
				if (!db.contains(d[i]))
					db.add(d[i]);
			} else {
				arr.add(d[i]);

			}

		}
		System.out.println("==" + db);

	}

}
