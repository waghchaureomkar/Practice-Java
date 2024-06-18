package practice.problems;

import java.util.HashMap;

public class FirstNonDublicate {

	static void Omkar(String key,Integer value) {
		System.out.println(key+value);
	}

	public static void main(String[] args) {

		String str = "swis";

		HashMap<String,Integer> arr = new HashMap<>();
		arr.put("Omkar", 8);
		arr.put("vi", 2);
		arr.put("Omjdkar", 8);
		arr.put("diw", 8);


		arr.forEach((om,value)->{
			System.out.println(om+value);
		});

	}

}
