import java.util.Scanner;

public class SwitchNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		switch(number)
		{
		case 10:
			System.out.println("you have entered number 10");
			break;
		case 100:
			System.out.println("you have entered 100");
			break;
		default:
			System.out.println("you have neither entered 10 nor 100");
		}
	}

}
