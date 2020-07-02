package Switch;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int level;
		String levelString="Expert";
		switch(levelString) {
		
		case "Beginner":level=1;
		break;
		
		case "Intermediate":level=2;
		break;
		
		case "Expert":level=3;
		break;
		
		default:level=0;
		
		}
		System.out.println("Your level is : "+level);

	}

}
