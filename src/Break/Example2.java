package Break;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		aa:
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==2&&j==2) {
					break aa;
				}
				System.out.println(i+" "+j);
			}
		}
	}

}
