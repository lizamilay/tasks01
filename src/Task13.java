import java.util.Scanner;
public class Task13 {
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
	     int sum;
	     sum =0;
	     while (a > 0) {
	    	 sum = sum + a;
	    	 a--; 	
	     }
	     System.out.println(sum);
	     sc.close();
	}

}
