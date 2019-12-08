
public class DigitsCalculation {

	public static void main(String[] args) {
		int no=45;
		int digits=0;
		while(no>0)
		{
			no=no/10;
			System.out.println(no);
			digits++;
		}
		System.out.println("Number of digits is "+digits);

	}

}
