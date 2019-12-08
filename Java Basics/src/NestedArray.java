
public class NestedArray {

	public static void main(String[] args) {
		int a[][]=new int[3][3];//size=3 index=0 to 2
		int num=10;
		//data insertion
		for (int i = 0; i < a.length;i++) //row length=5
		{
			for(int j=0;j<a.length;j++) //column
			{//i=0; j=0,1,2
				a[i][j]=num;//a[0][0]=10 //a[0][1]=20 //a[0][2]=30
				num=num+10;//num=20	//num=30  //num=40
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	/*	//data retrieval
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}*/
	}

}
