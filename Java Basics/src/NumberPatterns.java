
/*
 * 
 * 100
 * 010
 * 001
 * 
 */
public class NumberPatterns {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == j) {
					a[i][j] = 1;
				} else {
					a[i][j] = 0;
				}
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
