
public class IfElIfExample {

	public static void main(String[] args) {
		int marks=50;

		if(marks>=35&&marks<60)
		{
			System.out.println("you got c grade");
			marks=75;
			
		}
		else if(marks>=60&&marks<80)
		{
			System.out.println(" you got b grade");
			
		}
		else if(marks>=80&&marks<=100)
		{
			System.out.println("you got a grade");
			
		}
		else
		{
			System.out.println("you have not passed");
		}
	}

}
