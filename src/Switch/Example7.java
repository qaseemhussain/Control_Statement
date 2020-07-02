package Switch;

public class Example7 {
	public enum Day {  Sun, Mon, Tue, Wed, Thu, Fri, Sat  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Day[] now = Day.values();
		 for(Day Now:now) {
			 switch(Now) {
			 case Sun:    
                 System.out.println("Sunday");    
                 break;    
             case Mon:    
                 System.out.println("Monday");    
                 break;    
             case Tue:    
                 System.out.println("Tuesday");    
                 break;         
             case Wed:    
                 System.out.println("Wednesday");    
                 break;    
             case Thu:    
                 System.out.println("Thursday");    
                 break;    
             case Fri:    
                 System.out.println("Friday");    
                 break;    
             case Sat:    
                 System.out.println("Saturday");    
                 break;    
			 }
		 }
		 
	}

}
