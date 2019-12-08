
public class ArmstongNumber {

	public static void main(String[] args) {
		
	   //153=1^3 + 5^3 + 3^3= 1 + 125 + 27 =153
		int ams=0;
		int t;
		int no=153;
		int temp=no;
		//System.out.println(t);
		while(no>0)//153>0 //15>0 //0
		{
			t=no%10; //3 //5 //1 
			ams=ams+(t*t*t);//27 //125 //1
			no=no/10;//15 //1 //0
		}
		System.out.println("Ams is "+ams);
		
		if(ams==temp)
		{
			System.out.println("it is armstrong number");
		}
		else
		{
			System.out.println("It is not an armstrong number");
		}
		
		
	}

}
