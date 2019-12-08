
public class NestedForStarCombo {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++)//row
		{
			for(int j=1;j<=i;j++)//column
			{
			//	System.out.print(j);//123 //123 //123
				System.out.print(" * ");
				//System.out.print(i);//111 ///222 //333
			}
			System.out.println();
		}
		for(int i=2;i>=1;i--)//row
		{
			for(int j=i;j>=1;j--)//column
			{
				System.out.print(" * ");//*** //** // *
				
			}
			System.out.println();
		}

	}

}
