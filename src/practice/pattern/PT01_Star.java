package practice.pattern;

public class PT01_Star {
	public static void main(String[] args) {

		PatternsStar.pattern1(5);

	}

}

class PatternsStar {

//	patterns 1--------------

//	* * * * *
//	* * * * *
//	* * * * *
//	* * * * *
//	* * * * *
	public static void pattern1(int n) {
		System.out.println("1.pattern -------------->\n");

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				System.out.print("* ");

			}
			System.out.println(" ");
		}

	}
}