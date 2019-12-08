
public class NumberReversal {

	public static void main(String[] args) {
		int no=457;//754
		int rev=0;
		int t=0;
		int temp=no;
		while(no>0)
		{
			t=no%10;
			rev=(rev*10)+t;
			no=no/10;
		}
		System.out.println("Reversed number is "+rev);
		if(rev==temp)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}

}
