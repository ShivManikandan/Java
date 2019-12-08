
public class IfElseIf {

	public static void main(String[] args) {
		int marks=65;
		int d;
		if(marks>=35&&marks<60)
		{
			System.out.println("you got c grade");
			d=marks;
		}
		else if(marks>=60&&marks<80)
		{
			System.out.println(" you got b grade");
			d=marks;
		}
		else if(marks>=80&&marks<=100)
		{
			System.out.println("you got a grade");
			d=marks;
		}
		else
		{
			System.out.println("you have not passed");
		}


	}

}
