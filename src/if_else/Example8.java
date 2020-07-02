package if_else;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=60;
		int weight=60;
		if(age>18) {
			if(weight>50) {
				System.out.println("You are Eligible to donate blood");
			}
			else {
				System.out.println("You are not Eligible to donate blood");
			}
		}
		else {
			System.out.println("You are under 18");
		}
	}

}
