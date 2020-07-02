package Continue;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		while(i<=10) {
			if(i==5) {
				i++;
				continue;
			}
			System.out.println(i+" ");
			i++;
		}
	}

}
