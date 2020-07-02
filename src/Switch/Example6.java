package Switch;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch='C';
		int CollegeYear =3;
		switch(CollegeYear) {
		case 1:
			System.out.println("PF"+"ICT"+"Applied physics");
			break;
		case 2:
			switch(ch) {
			case 'C':
				System.out.println("OOPS-C "+" DLD-C "+" Multivariable Caculus-C");
				break;
			case 'D':
				System.out.println("OOPS-D "+" DLD-D "+" Multivariable Caculus-D");
				break;
			}
		case 3:
			switch(ch) {
			case 'C':
				System.out.println("Data Structure-C "+" Database-C "+" Differentiable Equation-C");
				break;
			case 'D':
				System.out.println("Data Structure-D "+" Database-D "+" Differentiable Equation-D");
				break;
			}
		}
	}

}
