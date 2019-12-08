import java.util.Scanner;

public class Summation {
//1+2+3+4+5+6+7
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sum number");
				int no=sc.nextInt();
		int sum=0,i=1;
		while(i<=no)//1<=5
		{
			sum=sum+i;//0+1
			i++;//2
		}
		System.out.println("Summation is "+sum);
	}

}
