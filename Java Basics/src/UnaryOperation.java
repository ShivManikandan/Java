
public class UnaryOperation {

	public static void main(String[] args) {
		int b1=10,b2=20;
		//prefix
		System.out.println(++b1);//pre increment b1=b1+1
		System.out.println("b1 = "+b1);
		//postfix
		System.out.println(b2++);//post increment b2=b2+1
		System.out.println("b2 = "+b2);
		//System.out.println("b2 = "+b2);
		
		int dec1=10,dec2=20;
		
		//pre decrement
		System.out.println(--dec1);//dec1=dec1-1
		System.out.println("dec1 = "+dec1);
		//post decrement
		System.out.println(dec2--);//dec2=dec2-1
		System.out.println("dec2 = "+dec2);
	}

}
