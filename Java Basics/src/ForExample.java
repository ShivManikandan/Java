
public class ForExample {
// 1*2*3*4*5
	public static void main(String[] args) {
		int fact=1;
		
		for(int i=2,no=5;i<=no;i++)
		{
			// 1*2=2 // 2*3=6 //6*4=24 // 24*5=120
			fact=fact*i;//2 //6 //24 //120
			
		}
		System.out.println("Factorial of no is "+fact);

	}

}
