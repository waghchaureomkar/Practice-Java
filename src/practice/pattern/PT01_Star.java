package practice.pattern;

public class PT01_Star {
	public static void main(String[] args) {

//		PatternsStar.pattern1(5);
//		PatternsStar.pattern2(5);
//		PatternsStar.pattern3(5);
//		PatternsStar.pattern4(5);
//		PatternsStar.pattern5(5);
//		PatternsStar.pattern6(5);
//		PatternsStar.pattern7(5);
//		PatternsStar.pattern8(5);
//		PatternsStar.pattern9(5);
//		PatternsStar.pattern10(5);
//		PatternsStar.pattern11(5);
//		PatternsStar.pattern12(5);
//		PatternsStar.pattern13(5);

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
		// for rows
		for (int i = 1; i <= n; i++) {
			// for columns in row
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

//	patterns 2--------------

//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * *

	public static void pattern2(int n) {
		System.out.println("\n2.pattern -------------->\n");

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

//	patterns 3--------------

//			* 
//	      * * 
//	    * * * 
//	  * * * * 
//	* * * * *

	public static void pattern3(int n) {
		System.out.println("\n3.pattern -------------->\n");

		for (int r = 1; r <= n; r++) {

			for (int s = 1; s <= n - r; s++) {
				System.out.print("  ");
			}

			for (int c = 1; c <= r; c++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

//	patterns 4--------------

//	* * * * *
//	* * * * 
//	* * * 
//	* * 
//	* 

	public static void pattern4(int n) {
		System.out.println("\n4.pattern -------------->\n");
		// for rows
		for (int r = n; r >= 1; r--) {
			// for star in one rows
			for (int c = r; c >= 1; c--) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

//	patterns 5-------------->

//	* * * * *
//	  * * * * 
//	    * * * 
//	      * * 
//			* 

	public static void pattern5(int n) {
		System.out.println("\n5.pattern -------------->\n");
		// for rows
		for (int r = 1; r <= 5; r++) {
			// for spaces
			for (int s = 1; s < r; s++) {
				System.out.print("  ");
			}
			// for star
			for (int c = n - r; c >= 0; c--) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

//	patterns 6--------------

//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * *
//	* * * * 
//	* * * 
//	* * 
//	* 

	public static void pattern6(int n) {
		System.out.println("\n6.pattern -------------->\n");
		// for rows
		for (int r = 1; r < n * 2; r++) {
			// for star in one rows
			int totalColumn = r <= n ? r : n * 2 - r;

			for (int c = 1; c <= totalColumn; c++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

//	patterns 7--------------
//			* 
//        * * 
//  	* * * 
//    * * * * 
//	* * * * *
//	  * * * * 
//	    * * * 
//	      * * 
//			* 

	public static void pattern7(int n) {
		System.out.println("\n7.pattern -------------->\n");
		// for rows
		for (int r = 1; r < n * 2; r++) {
			// for space in one rows
			int totalSpace = r <= n ? n - r : n - (n * 2 - r);
			for (int c = 1; c <= totalSpace; c++) {
				System.out.print("  ");
			}
			// for star in one rows
			int totalColumn = r <= n ? r : n * 2 - r;
			for (int c = 1; c <= totalColumn; c++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

//	patterns 8--------------

//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * *
//	  * * * * 
//	    * * * 
//	      * * 
//			* 

	public static void pattern8(int n) {
		System.out.println("\n8.pattern -------------->\n");
		// for rows
		for (int r = 1; r < n * 2; r++) {
			// for space in one rows
			int totalSpace = r <= n ? 0 : n - (n * 2 - r);
			for (int c = 1; c <= totalSpace; c++) {
				System.out.print("  ");
			}
			// for star in one rows
			int totalColumn = r <= n ? r : n * 2 - r;
			for (int c = 1; c <= totalColumn; c++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

//	patterns 9--------------

//		* 
//	   * * 
//	  * * * 
//	 * * * * 
//	* * * * *
//	 * * * * 
//	  * * * 
//	   * * 
//		* 

	public static void pattern9(int n) {
		System.out.println("\n9.pattern -------------->\n");
		// for rows
		for (int r = 1; r < n * 2; r++) {
			// for space in one rows
			int totalSpace = r <= n ? n - r : n - (n * 2 - r);
			for (int c = 1; c <= totalSpace; c++) {
				System.out.print(" ");
			}
			// for star in one rows
			int totalColumn = r <= n ? r : n * 2 - r;
			for (int c = 1; c <= totalColumn; c++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

//	patterns 10--------------

//* * * * *
// * * * * 
//  * * * 
//   * * 
//	  * 
//	 * * 
//	* * * 
// * * * *
//* * * * *

	public static void pattern10(int n) {
		System.out.println("\n10.pattern -------------->\n");
		// for rows
		for (int r = 1; r < n * 2; r++) {

			int totalStar = r < n ? n - r : n - (n * 2 - r);
			int totalSpace = r < n ? r : n * 2 - r;

			for (int s = 0; s <= totalSpace; s++) {
				System.out.print(" ");
			}
			for (int s = 0; s <= totalStar; s++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}
}