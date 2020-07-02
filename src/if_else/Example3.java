package if_else;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year=2020;
		if(year%4==0||year%400==0||year%100!=0) {
			System.out.println("Year is leap:");
		}
		else {
			System.out.println("Year is Common:");
		}
	}

}
