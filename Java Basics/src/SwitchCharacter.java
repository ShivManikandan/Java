
public class SwitchCharacter {

	public static void main(String[] args) {
		char c='a';
		switch(c)
		{
		case 'a':
		case 'A':
			System.out.println("you have entered a");
			break;
		case 'b':
			System.out.println("you have entered b");
			break;
		default:
			System.out.println("you have neither entered a nor b");
		}

	}

}
