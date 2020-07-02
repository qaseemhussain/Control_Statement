package Continue;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				if(i==3&&j==2) {
					continue;
				}
				System.out.println(i+" "+j);
			}
		}
	}

}
