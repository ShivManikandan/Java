
public class ArrayExample {

	public static void main(String[] args) {
		int[] a = new int[4];// size=4; index=size-1

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		// a[4]=50;
		int[] b = { 10, 20, 30, 40 };
		// System.out.println(a.length);
		/*
		 * for(int i=0;i<a.length;i++) { System.out.println(a[i]); }
		 */

		// enhanced for loop
		for (int i : a) {
			System.out.println(i);
		}
	}

}
