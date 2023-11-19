package practice.pattern;

public class PT02_Num {
	
	public static void main(String[] args) {
		
		PatternsNum.pattern1(5);
//		PatternsNum.pattern2(5);
//		PatternsNum.pattern3(5);
//		PatternsNum.pattern4(5);
//		PatternsNum.pattern5(5);
		
	}

}

class PatternsNum {
	
	
//	patterns 1--------------

// 1
// 1 2
// 1 2 3
// 1 2 3 4 
// 1 2 3 4 5
	
	public static void pattern1(int n) {
		System.out.println("1.pattern -------------->\n");
		// for rows
		for (int r = 1; r <= n; r++) {
			// for columns in row
			for (int c = 1; c <= r; c++) {
				System.out.print(c+" ");
			}
			System.out.println(" ");
		}

	}
}
