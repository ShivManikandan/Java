
public class Addition {
	int a,b,c;
	float a1,b1;
	public static void main(String[] args) {
		Addition a1=new Addition();
		System.out.println(a1.addNumbers(100,101,102));
		Addition a2=new Addition();
		System.out.println(a2.addNumbers(10,20));
		Addition a3=new Addition();
		System.out.println(a3.addNumbers(10.0f,20.4f));
		
	}
	public int addNumbers(int a,int b)
	{
		
		
		this.a=a;//a1.a=a //a2.a=a
		this.b=b;
		return a+b;
	}
	public float addNumbers(float a,float b)
	{
		
		this.a1=a;//a1.a=a //a2.a=a
		this.b1=b;
		return a1+b1;
	}
	public int addNumbers(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		return a+b+c;
	}
	

}
