import java.util.Scanner;
public class Task14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		a = 0;
		System.out.print("¬ведите a: ");
		if (sc.hasNextInt()) {
	     a = sc.nextInt();
		}
	     while (a < 0) {
	    	 System.out.print("¬ведите a: ");
	 		if (sc.hasNextInt()) {
	 	     a = sc.nextInt(); 
	     }	
	     }
	     int fact;
	     fact = 1;
	     while (a > 0) {
	    	 fact = fact * a;
	    	 a--; 	
	     }
	     System.out.println(fact);
	     sc.close();
	}

}
