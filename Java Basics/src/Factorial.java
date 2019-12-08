import java.util.Scanner;

public class Factorial {
//5!=5*4*3*2*1
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the factorial number");
				int no=sc.nextInt();
		int fact=1,i=1;
		while(i<=no)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial is "+fact);
		

	}

}
