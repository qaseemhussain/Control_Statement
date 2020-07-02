package Break;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int i=1;
		do {
			if(i==6) {
				i++;
				break;
			}
			System.out.println(i+" ");
			i++;
		}
		while(i<=10);
	}

}
