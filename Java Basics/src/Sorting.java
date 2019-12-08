import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int no[] = { 20, 40, 70, 50, 10, 60 };
		int temp;

		for (int i = 0; i < no.length; i++) {
			for (int j = i + 1; j < no.length; j++) {
				if (no[i] > no[j])// ascending order

				// if(no[i]<no[j]) descending order
				{
					temp = no[i];
					no[i] = no[j];
					no[j] = temp;

				}
			}
		}
		for (int i : no) {
			System.out.println(i);
		}

	}

}
