
public class WhileLoop {

	public static void main(String[] args) {
		int no=1;
		//condition is checked first and then value of no is incremented
		while(no++<=3)//1<=3 //3<=3 //5<=3
		{
			//2 //4
			System.out.println(no);
			no++;//3 //5
		}

	}

}
