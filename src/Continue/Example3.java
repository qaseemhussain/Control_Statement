package Continue;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		aa:
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=6;j++) {
				if(i==2&&j==3) {
					continue aa;
				}
				System.out.println(i+" "+j);
			}
		}
	}

}
