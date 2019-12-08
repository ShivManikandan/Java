
public class TypeConversion {

	public static void main(String[] args) {
		byte b1=125;
		int no=b1;
		System.out.println("no = "+no);//widening 
		
		int no_value=120;
		//byte b_value=no_value;
		byte b_value=(byte)no_value;//narrowing
		System.out.println("b_value = "+b_value);

	}

}
