
public class NestedFor1 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++)//row
		{
			for(int j=1;j<=3;j++)//column
			{
				System.out.print(j);//123 //123 //123
				//System.out.print(i);//111 ///222 //333
			}
			System.out.println();
		}

	}

}
