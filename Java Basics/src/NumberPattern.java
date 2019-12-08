
public class NumberPattern {

	public static void main(String[] args) {
		for (int i = 1, j = 0; i <= 9; i++, j++) {

			System.out.print(j + " ");
			if (i % 3 == 0) {
				System.out.println();
			}
		}

	}

}
